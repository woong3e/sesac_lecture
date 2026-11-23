team_name = '새싹'
price = 123_456

print(team_name)

print(f'{team_name}의 가격은 {price:,}원') # f-string → 새싹의 가격은 123,456원

# list: 순서가 있고 내용을 변경할 수 있는 자료형
scores = [88,99,67]
scores.append(80)
scores.insert(0,0)
scores.append(80)
print(scores)
last_score = scores.pop()
print(f'꺼낸 점수: {last_score}')

# dict: 키와 값을 한 쌍으로 저장하는 자료형
user = {'name': '박지성', 'age': 40}
print(f'사용자 정보:{user}, 이름: {user['name']}')
# 키가 없으면 새로 추가, 있으면 기존 값을 덮어쓴다
user['job'] = '축구선수'
user['age'] = 99
print(user)

# 존재하지 않는 키를 대괄호로 조회하면 KeyError 발생
# print(user['email']) # KeyError: 'email' 발생

# get(키, 기본값)은 키가 없어도 오류 대신 기본값 반환
email = user.get('email', '정보없음')
print(f'사용자 이메일: {email}')

# list와 dict 조합
users = [
    {'name': '박지성'},
    {'name': '신사임당', 'job': '화가'}
]

print(users[1]['name'])
print(users[0].get('job', '정보없음'))
