/* array 배열 
관련된 값들을 하나의 목록으로 묶어서 관리한다.
배열이름[인덱스] <<--요소
인덱스는 0부터 시작.

*/

const fruits = ["바나나", "복숭아", "키위"];
console.log(fruits);

console.log(fruits[1]); //'복숭아'
console.log(fruits[3]); //undefined
console.log(fruits.length); //3
fruits[1] = "딸기";
console.log(fruits);
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);

// 배열을 순회하기
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

console.log(typeof fruits); //object 라고만 나오니까
console.log(Array.isArray(fruits)); // 배열 확인하는 방법.
