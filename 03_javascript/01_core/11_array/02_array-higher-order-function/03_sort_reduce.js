/* sort , reduce */

const numbers = [3, 1, 9, 10, 5];

const sorted = numbers.sort(); // 원본 배열을 정렬한다
console.log(sorted);
console.log(sorted === numbers); // true

numbers.sort((a, b) => {
  return a - b;
});

// 반환값이 음수다 : a를 b보다 앞에 놓는다.
// 반환값이 양수다 : a를 b보다 뒤에 놓는다.
// 0 : 이 비교 기준에서 같은 순위로 취급한다.

// reduce

// for문으로 만들면

const amounts = [1000, 2000, 3000];
let sum = 0;

for (let i = 0; i < amounts.length; i++) {
  sum += amounts[i];
}

console.log(sum);
// 누적하기 recuce 사용
const total = amounts.reduce((sum, current) => {
  return sum + current;
}, 0);

console.log(total);
console.log(
  `빈 배열 합계: ${[].reduce((sum, current) => {
    return sum + current;
  }, 0)}`,
);
