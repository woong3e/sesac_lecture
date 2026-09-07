/*
논리 연산자는 여러 조건을 결합하여 하나의 논리적 결과를 도출한다
논리 연산자는 And, Or, Not 연산자가 있다.
*/

const a = true;
const b = false;

//1 .논리 And (&&)

console.log(a && b); //a와 b 모두 true 일 때만 true

//2. 논리 Or(a || b)    //a 또는 b중 하나만 true 이면 true

console.log(a || b); //a와 b 모두 true 일 때만 true

//3. 논리 Not (!)
console.log(!a);

/*
단축 평가
-> 표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평가 과정을 생략하는 것
*/

//Or 의 경우 'apple'이 이미 truthy한 값이어서 true로 평가되고
// 논리 연산의 결과를 결정한 첫 번째 피연산자인 apple을 그대로 반환한다.
console.log("apple" || "banana");
console.log(false || "banana");

//And 의 경우 좌항, 우항 모두 확인해야 하므로
//논리 연산의 결과를 결정하는 두 번째 피연산자 banana를 그대로 반환한다.
console.log("apple" && "banana");
console.log(false && "banana");

/* 
삼항 연산자 : 조건식에 따라 두 값 중 하나를 선택하는 연산자
조건 ? 값1 : 값2
조건이 true일 경우 값1, false일 경우 값2를 선택한다.
 */

const age = 20;
const result = age >= 20 ? "성인" : "미성년자";
console.log(result);
