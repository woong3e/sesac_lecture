/* 구조 분해 할당
배열이나 객체의 속성을 해체하여 그 값을 개별 변수에 손쉽게 담을 수 있게 하는 표현식
*/

const colors = ['빨강', '파랑'];

const red = colors[0];
const blue = colors[1];

// 배열 구조 분해 할당
const [primaryColor, secondaryColor] = colors;
console.log(primaryColor);
console.log(secondaryColor);

// 기본 값 사용
const [leader, assistant = '미정'] = ['박지성'];
console.log(leader, assistant);

const [first, ...other] = ['박지성', '손흥민', '차범근'];
console.log(first, other);

// 객체 구조 분해 할당
const student = {
  name: '박지성',
  age: 16,
  major: '역사',
};

const studentName = student.name;
const studentAge = student.age;
console.log(studentName, studentAge);

// 객체 구조 분해는 순서가 아니라 프로퍼티 키 이름으로 값을 찾는다.
// 필요한 프로퍼티만 꺼내와서 사용 할 수 있다.
const { age, major } = student;
// console.log(name);
const { name: learnerName, job = '학생' } = student; // name 키의 값을 learnerName 이라는 새 변수에 담는다
console.log(learnerName);
console.log(job);

const product = {
  name: '키보드',
  price: 70000,
};

// function printProduct(product) {
//   const { name, price } = product;
function printProduct({ name, price }) {
  console.log(`상품명: ${name}`);
  console.log(`가격: ${price}`);
}

printProduct(product);

// 배열 고차함수의 콜백에서 사용
const products = [
  { name: '키보드', price: 50000 },
  { name: '마우스', price: 30000 },
];
// 기존 방식
const productNames = products.map((product) => product.name);
const productPrices = products.map((product) => product.price);
console.log(productNames, productPrices);

// 객체 구조 분해 할당 적용시, 이런식으로도 사용 가능하다.
// 객체 구조 분해 매개변수: 소괄호 필요
const productNames1 = products.map(({ name }) => name);
const productPrices2 = products.map(({ price }) => price);
console.log(productNames);

const product1 = {
  name: '노트북',
  price: 200000,
  spec: {
    cpu: 'i7',
    ram: '16gb',
  },
};

function printProduct1({ name, price, spec: { cpu }, producer = '삼성' }) {
  console.log(`상품 이름 :${name}`);
  console.log(`상품 가격 :${price}`);
  console.log(`cpu :${cpu}`);
  console.log(`제조사 :${producer}`);
}
printProduct1(product1);
