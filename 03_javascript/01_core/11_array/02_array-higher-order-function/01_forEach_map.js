const students = [
  {
    name: "박지성",
    score: 90,
  },
  {
    name: "손흥민",
    score: 80,
  },
  {
    name: "황인범",
    score: 95,
  },
];

students[0];
// console.log(students[0].name);

// for문으로 배열 속 객체의 이름만 출력해보기
for (let i = 0; i < students.length; i++) {
  console.log(students[i].name);
}

students.forEach((el) => {
  console.log(el.name);
});

students.forEach((el, index) => {
  console.log(`${index + 1} 번째 이름: ${el.name}`);
});
// 세번째 인자는 원본 배열인데 콜백함수 내에서 원본 배열이 필요한 경우 array.length 라든지 이런 경우에 사용한다. 바깥 변수를 직접 참조할수도있긴함.students.length

// forEach는 콜백함수의 반환값을 모아주지 않는다. forEach의 반환값은 undefined
// 새로운 배열을 반환받으려면 map을 사용해보자.
const ignoredNames = students.forEach((el) => el.name);
console.log(ignoredNames);

// map : 각 요소를 콜백의 반환값으로 바꾼 결과를 새 배열로 만들어 준다.
const studentNames = students.map((el) => el.name);
console.log(studentNames); //[ '박지성', '손흥민', '황인범' ]
// 원본 배열에 영향을 주지 않는다.
console.log(students[0]);

// 점수에 5점을 더하여 배열로 반환받기
const adjustedScores = students.map((el) => {
  return el.score + 5;
});
console.log(adjustedScores);
