/*
변수
변수는 데이터들 저장할 때 쓰이는 '이름이 붙은 저장소'이다.
변수를 생성할 때 우리는 변수를 선언한다고 표현한다.

변수 선언 방법

키워드 변수명;
키워드 : 변수를 어떤 규칙으로 만들지 정함
변수명: 값을 다시 사용할 때 부를 변수의 이름

var : es5까지 사용했던 키워드
단점을 보완하기 위해 es6에서 새로운 키워드인 const,let을 도입.

*/

var number; // 변수 선언
number = 5; // 값 할당
console.log(number);

// 선언과 동시에 할당(초기화)
let greeting = "Hello, nodejs";
console.log(greeting);

greeting = "welcome";
console.log(greeting);

// const : 재할당 금지
// 반드시 선언과 동시에 초기화 해야 한다.
// const num;
const num = 1;
// num = 2;
console.log(num);

/* 변수명 규칙 
변수 이름에는 문자, 숫자, _, $ 등을 사용할 수 있다.
변수 이름은 숫자로 시작할 수 없다.
카멜케이스를 사용하는 것이 일반적이다.
*/
const userName = "panda"; // 두번째 단어부터 첫 글자를 대문자로 쓰는 camelCase가 일반적
const userAge = 5;
console.log(userName);
console.log(userAge);
