// for ... of 이터러블
// 이터러블은 값은 순서대로 하나씩 꺼낼 수 있는 값이다. 배열과 문자열이 대표적이다.

const fruits = ['🍎', '🍌', '🍇'];

for (let i = 0; i < fruits.length; i++) {
  console.log('일반 for문: ', i, fruits[i]);
}

// for ... of 문
for (const fruit of fruits) {
  console.log('for ... of: ' + fruit);
}

for (const fruit of fruits) {
  if (fruit === '🍌') break;
  console.log(fruit);
}

// 문자열 안에서도 사용할 수 있다.
const message = '안녕';

for (const character of message) {
  console.log('글자', character);
}

// 일반 객체는 iterable이 아니므로 사용할 수 없다.
// 일반 객체는 Object.keys(),values(),entries()와 함께 사용한다.
/* const student = {
  name: '박지성',
  score: 80,
};

for (const value of student) { // TypeError: student is not iterable
  console.log(value);
}
 */
