import json

# 요청에 붙일 JSON 문자열을 만든다.
feedback = {'id':1, 'text':'실습이 도움이 됐어요.'}
request_json = json.dumps(feedback,ensure_ascii=False)
print(request_json)

# 응답 예시에서 필요한 값 얻기
reply = '{"id": 1, "score": 75}'
result = json.loads(reply)
print(result['score'])  # 75

#           dumps (보낼 때)
# dict/list  ─────────────────>  JSON 문자열(str)
# dict/list  <─────────────────  JSON 문자열(str)
#           loads (받을 때)

broken_reply = '{"id":1, "score": 75'
try:
    broken_result = json.loads(broken_reply)
except json.JSONDecodeError:
    print(f"응답을 JSON으로 읽을 수 없습니다.")