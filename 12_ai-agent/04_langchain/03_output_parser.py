from typing import Literal
from pydantic import BaseModel, ConfigDict, Field
from langchain_core.prompts import PromptTemplate
from langchain_core.output_parsers import JsonOutputParser,PydanticOutputParser
from langchain_core.exceptions import OutputParserException
from langchain_openai import ChatOpenAI
from dotenv import load_dotenv
from openai import APIError

# Pydantic: 파이썬에서 데이터의 형태(필드와 타입)를 클래스로 정의하고,
# 들어온 값이 그 형태에 맞는지 검사해 주는 라이브러리입니다.
# BaseModel을 상속받아 필요한 항목을 선언하고, 검증을 통과한 값을 객체로 다룹니다.
class SentimentAnalysis(BaseModel):
    model_config = ConfigDict(extra="forbid")   # 이 클래스의 검사 설정, 선언하지 않은 추가 필드는 허용하지 않겠다.(forbid)
    label: Literal["긍정", "부정", "중립"] = Field(description="허용된 감정 분류")
    reason: str = Field(min_length=1, description="판단 근거")

SAMPLE_REPLY1 = '{"label": "매우 좋음", "reason": "어려움과 긍정적인 평가가 함께 있습니다."}' # label이 긍정,부정,중립이 아닌 예시.
SAMPLE_REPLY2 = '{"label": "중립", "reason": "어려움과 긍정적인 평가가 함께 있습니다."}'
SENTENCE = "수업이 어렵지만 예제가 있어서 따라갈 만하다."

def build_chain(model):
    # PydanticOutputParser: JSON을 클래스 규칙으로 검증하고, 통과한 값을 그 클래스의 객체로 반환한다.
    parser = PydanticOutputParser(pydantic_object=SentimentAnalysis)
    format_instructions = parser.get_format_instructions # get_format_instructions: 모델에게 "이 형식으로 답해라"라고 알려주는 안내문을 자동으로 만들어 주는 메서드

    prompt = PromptTemplate.from_template(
        "아래 수강평의 감정을 분류하고 이유를 적으세요.\n"
        "{format_instructions}\n"
        "수강평: {sentence}"
    )

    prompt = prompt.partial(format_instructions=format_instructions)

    return prompt | model | parser

def show_parsers():
    # JsonOutputParser: JSON을 Python 값으로 읽는다.
    format_only = JsonOutputParser()
    data = format_only.invoke(SAMPLE_REPLY1)
    print("JSON 읽기만 한 값: ",data["label"])

    # PydanticOutputParser
    parser = PydanticOutputParser(pydantic_object=SentimentAnalysis)
    result = parser.invoke(SAMPLE_REPLY2)
    print("결과 타입", type(result).__name__)
    print("감정:",result.label)
    print("이유:",result.reason)

    # sonOutputParser → dict로 받습니다. 
    # 형식이 맞는지 검사하지 않습니다. 그래서 "label": "매우 좋음"이 와도 그대로 통과합니다.
    # PydanticOutputParser → SentimentAnalysis 객체로 받습니다. 검사도 합니다. 
    # label이 긍정, 부정, 중립 중 하나가 아니거나, reason이 비어 있거나, 
    # 정의하지 않은 필드가 있으면 오류를 냅니다.

def show_chain():
    load_dotenv()
    model = ChatOpenAI(
        model="gpt-4.1-mini",
        temperature=0,
        max_retries=0,
        timeout=20,
        max_completion_tokens=200,
        use_responses_api=False
    )
    try:
        result = build_chain(model).invoke({"sentence":SENTENCE})
    except OutputParserException:
        print("응답 검증 실패: 감정 분류와 이유 형식을 확인하세요")
        return
    except APIError as error:
        print("API 요청 실패", type(error).__name__)
        return
    print("결과 타입", type(result).__name__)
    print("감정:", result.label)
    print("이유:", result.reason)

if __name__ == "__main__":
    print("\n======== 출력 파서 비교 ========")
    show_parsers()
    print("\n======== 모델 체인 ========")
    show_chain()

# 정리
# show_parsers(): 모델 없이 샘플 문자열로 두 파서를 비교합니다.

# JsonOutputParser로 SAMPLE_REPLY1을 읽습니다. "매우 좋음"이라는 잘못된 값도 검사 없이 dict로 통과합니다.
# PydanticOutputParser로 SAMPLE_REPLY2를 읽습니다. 검증을 통과해 SentimentAnalysis 객체가 되고, .label과 .reason으로 꺼내 출력합니다.
# show_chain(): 실제 모델을 호출해서 수강평 감정을 분류합니다.

# .env에서 API 키를 불러와 ChatOpenAI 모델을 만듭니다.
# build_chain(model)로 만든 prompt | model | parser 체인에 SENTENCE를 넣어 실행합니다.
# 모델 답이 형식에 맞지 않으면 OutputParserException, API 요청이 실패하면 APIError로 처리해서 메시지를 출력합니다.