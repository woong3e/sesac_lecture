/*  1. 함수 표현식

*/
const hi = function (name) {
  return `${name}님 안녕하세요`;
};
console.log(hi("판다"));

console.log(hello("호이스팅"));

// 함서 선언문은 코드 실행 전에 먼저 준비되기 때문에 선언 위치보다 위에서 참조 가능
// 함수 선언문이 코드의 가장 위로 올라간 것처럼 보이는 동작을 호이스팅이라고 한다.

// 함수 선언문의 호이스팅
function hello(name) {
  return `${name} 안녕`;
}
