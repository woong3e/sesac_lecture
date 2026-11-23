fruits = ['orange', 'apple','banana','kiwi']

long_fruits = []

for fruit in fruits:
    if len(fruit) >= 5:
        long_fruits.append(fruit.upper())
        
print(f'{long_fruits}')

# for문으로 새 리스트를 만드는 코드를 한 줄로 줄여 쓰는 문법이다.
# [ fruit        for fruit in fruits        if len(fruit) >= 5 ]
#   ① 담을 값    ② 반복                    ③ 조건 (생략 가능)
# 읽는 순서는 ② → ③ → ①
compact_fruits = [fruit.upper() for fruit in fruits if len(fruit) >= 5 ]
print(compact_fruits)   # ['ORANGE', 'APPLE', 'BANANA']