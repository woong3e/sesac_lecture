"use strict";
/* 화살표 함수 */

// 일반적인 함수 표현식
const power = function (x) {
  return x * x;
};

console.log(power(3));

const arrowPower = (x) => {
  return x * x;
};
console.log("화살표 함수", arrowPower(3));

const square = (x) => x * x;
console.log(square(3));

// 매개변수가 없는 경우의 사용

const greet = () => "하이";
const add = (a, b) => a + b;
console.log(greet());
console.log(add(1, 2));

const calculateSquare = (x) => {
  return x * x;
};

// 중괄호를 쓸거면 return이 빠찌면 안 돼
const wrongSquare = (x) => {
  x * x;
};

console.log(wrongSquare(3)); // undefined

// 화살표 함수 쓸때, 객체를 반환하는 경우에 중괄호를 신경써서 봐주도록 하자.
const createUser = (id, name) => {
  return {
    id: id,
    name: name,
  };
};

console.log(createUser(1, "민수"));

// 화살표 함수를 콜백함수로 사용해보자.

function calculate(value, callback) {
  return callback(value);
}

console.log(calculate(3, power));
console.log(calculate(3, (number) => number * number));
