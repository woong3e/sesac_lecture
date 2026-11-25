# [LangChain]
# LLM을 활용하는 프로그램에서 프롬프트 작성, 모델 호출, 응답 처리를 연결하는 라이브러리
# 필요한 단계를 연결해 하나의 실행 흐름(체인)으로 구성할 수 있다.

from langchain_core.prompts import ChatPromptTemplate, PromptTemplate

def show_prompt_template():
    template = PromptTemplate.from_template("{audience}에게 {topic}에 대해 쉽게 설명하세요.")
    prompt_value = template.invoke({
        "audience": "JAVA를 배운 Python 입문자",
        "topic": "LLM"
    })
    print("문자열 템플릿: ", prompt_value.to_string())

# PromptTemplate: 하나의 문자열로 된 프롬프트를 만든다.
# ChatPromptTemplate: system/human 같은 역할이 붙은 메시지 목록으로 프롬프트를 만든다.
# invoke(): 템플릿의 {변수}에 값을 채워 PromptValue 객체를 반환한다.
#           (.to_string() → 문자열, .to_messages() → 메시지 리스트)

def show_chat_prompt_template():
    template = ChatPromptTemplate.from_messages([
        ("system", "초보자에게 쉬운 말로 설명하세요"),
        ("user", "질문: {question}\n답변 형식: {answer_format}"),
    ])
    prompt_value = template.invoke({
        "question": "LangChain이랑 LangGraph는 어떤 차이가 있어?",
        "answer_format": "표로 시각화해서 보기 쉽게 설명해줘"
    })
    for message in prompt_value.to_messages():
        print(f"[{message.type}]{message.content}")

if __name__ == "__main__":
    show_prompt_template()
    show_chat_prompt_template()
