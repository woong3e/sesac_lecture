/*
동적 타입 언어(JS,Python 등)
변수에 현재 들어있는 값에 따라 타입이 결정된다.

1. 숫자(Number)
하나의 숫자 타입만 존재하고 모든 수를 실수로 처리한다.
*/

const age = 30;
console.log(30);
console.log(typeof age);

/*
2. 문자열(String)
문자열은 작은 따옴표,큰 따옴표, 백틱 으로 텍스트를 감싼다.
*/

const string = "문자열";
const string2 = `문자열`;
console.log(string, string2, typeof string, typeof string2);

/*
불리안(Boolean) : 논리적 참, 거짓을 나타내는 true와 false 뿐이다.
*/

const isStudent = true;
console.log(isStudent, typeof isStudent);

/*
4. 널(Null) : 값이 없음을 의도적으로 명시할 때 사용
*/

const address = null;
console.log(address, typeof address);

/*
5. undefined : 변수에 값이 할당되지 않았을 때 자동으로 할당되는 값
*/
let salary;
console.log(salary, typeof salary);

/*
템플릿 리터럴
ES6에서부터 도입된 문자열 표기법
작은 따옴표, 큰 따옴표 대신 백틱을 사용해서 표현한다.
*/

const lastName = "장";
const firstName = "건웅";
console.log("제 이름은 " + lastName + firstName + "입니다.");
console.log(`제 이름은 ${lastName}${firstName}입니다.`); // << 템플릿 리터럴 사용 예시

const str = `안녕하세
요`; //템플릿 리터럴은 줄바꿈 허용.
console.log(str);
