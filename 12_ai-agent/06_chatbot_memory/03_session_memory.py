from dotenv import load_dotenv
from langchain.agents import create_agent
from langchain_core.runnables import RunnableConfig
from langchain_openai import ChatOpenAI
from langgraph.checkpoint.memory import InMemorySaver
from openai import APIError

def main():
    load_dotenv()
    model = ChatOpenAI(
        model="gpt-4.1-mini",
        temperature=0,
        max_completion_tokens=300,
        timeout=20,
        max_retries=0,
        use_responses_api=False
    )
    # 모델을 호출하고 대화를 진행할 실행 객체를 만든다.
    agent = create_agent(
        model=model,
        tools=[],
        system_prompt="친절한 한국어 도우미입니다. 기록에 없는 이름은 추측하지 마세요",
        checkpointer=InMemorySaver()    # 실행 상태를 프로그램 메모리에 보관
    )

    sessions = [
        ("student-a","내 이름은 지성이야. 인사해줘."),
        ("student-b","내 이름은 흥민이야. 인사해줘."),
        ("student-a","내 이름이 뭐야?"),
        ("student-b","내 이름이 뭐야?")
    ]
    for session_id, question in sessions:
        # 이번 설정에 사용할 설정 딕셔너리
        config: RunnableConfig = {"configurable": {"thread_id": session_id}}
        result = agent.invoke({"messages":[{"role":"user","content":question}]}, config=config)
        print(f"\n[{session_id} User: {question}]")
        print("Bot:", result["messages"][-1].content)

    for session_id in ("student-a","student-b"):
        config: RunnableConfig = {"configurable":{"thread_id": session_id}}
        # 해당 thread_id의 현재 상태를 가져오고, 그 안의 메세지 목록을 꺼낸다.
        messages = agent.get_state(config).values["messages"]
        print(f"{session_id}에 저장된 기록: {len(messages)}개")
        for message in messages:
            print(f"{message.type}: {message.content}")

if __name__ == "__main__":
    try:
        main()
    except APIError as error:
        print("API 요청 실패", type(error).__name__)
        