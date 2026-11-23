def create_greeting(name: str, age: int = 20) -> str:
    return f'안녕하세요, {age}세 {name}님'


print(create_greeting('박지성',40))
print(create_greeting('손흥민'))
print(create_greeting(age=45,name='차범근'))

greeting = create_greeting('영희')
print(greeting)
