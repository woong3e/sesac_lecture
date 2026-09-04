/* 
implicit coercion : 암묵적 타입변환
개발자가 직접 변환을 명령하지 않아도 자바스크립트 엔진이 문맥에 맞게 타입를 자동 변환하는 것
+ 연산자는 문자열이 끼어 있으면 연결 연산자로 동작한다.
*/

console.log(`문자열 타입으로 변환:` + 10 + "20", typeof (10 + "20"));
console.log(1 + ``, typeof (1 + ``));
console.log(true + ``, typeof (true + ``));
console.log(null + ``, typeof (null + ``));

console.log("숫자 타입으로 변환", 10 - "5", typeof (10 - "5"));
console.log(10 * "5");
console.log(10 / "5");
console.log(10 % "javascript"); //NaN, not a number❌

// 숫자와 문자열을 비교하면 문자열을 숫자로 변환한 뒤 비교한다.
console.log(10 > "5");

// + 단항 연산자는 피연산자가 숫자 타입의 값이 아니면 숫자 타입으로 암묵적 타입 변환
console.log(+"");
console.log(+true);
console.log(+false);

// 불리안 타입으로 변환

// 자바스크립트 엔진은 불리안 타입이 아닌 값을 Truthy한 값(참으로 평가 되는 값)
// 또는 Falsy한 값(거짓으로 평가되는 값)으로 구분한다.

/*
Falsy 값(false로 평가되는 값) ➡️ false,0(숫자0),''(빈문자열),null,undefined,Nan
*/

if (10 > 5) console.log("Truthy");
if (!"") console.log("Falsy");
