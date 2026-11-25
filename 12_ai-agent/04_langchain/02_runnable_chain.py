from dotenv import load_dotenv
from openai import APIError, OpenAI

from langchain_core.prompts import ChatPromptTemplate
from langchain_core.output_parsers import StrOutputParser
from langchain_openai import ChatOpenAI

def build_chain(model):
    prompt = ChatPromptTemplate.from_messages([
        ("system", "LLM 활용을 가르치는 강사입니다. 세 문장 이내로 설명하세요"),
        ("user", "{audience}에게 {topic}을 쉽게 설명하세요")
    ])
    # LCEL(LangChain Expression Language)은 |로 Runnable들을 이어 체인을 만드는 LangChain의 작성 방식입니다.
    # StrOutputParser(): 모델의 응답 메시지(AIMessage)에서 텍스트를 꺼내 문자열로 반환한다.
    # |: 파이프 연산자로, 왼쪽의 작업 결과를 오른쪽 작업의 입력으로 넘기도록 연결해준다.
    return prompt | model | StrOutputParser()


def main():
    load_dotenv()
    model = ChatOpenAI(
        model="gpt-4.1-mini",
        temperature=0.5,
        max_completion_tokens=200,
        timeout=20,
        max_retries=0,
        # use_responses_api는 ChatOpenAI가 OpenAI의 어떤 API로 요청을 보낼지 정하는 옵션입니다.
        # True: 새로 나온 Responses API를 씁니다. 웹 검색 같은 OpenAI 내장 도구나 추론 요약 같은 최신 기능을 쓸 수 있습니다.
        # False: 기존 Chat Completions API를 씁니다.
        # 지정하지 않으면: LangChain이 사용하는 기능을 보고 알아서 고릅니다.
        use_responses_api=False,
    )
    chain = build_chain(model)
    try:
        result = chain.invoke({
            "audience": "파이썬 입문자, 이름은 장건웅",
            "topic": "Langchain에 대한 학습"
        })
    except APIError as error:
        print("요청실패", type(error))
        return
    print("답변:",result)

if __name__ == "__main__":
    main()
