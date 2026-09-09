const user = {
  id: "user",
  activate: true,
  login: function () {
    console.log(`${this.name}님이 로그인 되었습니다.`);
  },
};

/* const student = {
  id: "user",
  activate: true,
  login: function () {
    console.log(`${this.name}님이 로그인 되었습니다.`);
  },
  passion: true,
};
 */

// create : 새로운 빈 객체를만들고, 그 객체가 프로퍼티를 찾을 때 user도 살펴볼 수 있도록 연결한다.
// student 의 프로토타입을 user로 설정한다.
const student = Object.create(user);
student.passion = true;
console.log(student.activate);
console.log(student.passion);

// student 가 프로토타입을 연결한 객체 확인
console.log(Object.getPrototypeOf(student));
// student 가 activate 프로퍼티를 직접 가지고 있는지 확인.
console.log("자신의 activate: ", Object.hasOwn(student, "activate"));
console.log("자신의 passion: ", Object.hasOwn(student, "passion"));

console.log("activate" in student);

const greedyStudent = Object.create(student); // user - student - greedyStudent
greedyStudent.greed = true;
greedyStudent.id = "student01";

console.log(greedyStudent.activate);
console.log(greedyStudent.passion);
console.log(greedyStudent.missing);
console.log(greedyStudent.greed);

console.log(greedyStudent.id);
console.log(user.id);

// 호출 주체인 점(.) 앞의 객체의 this를 참조한다.
greedyStudent.login();

delete greedyStudent.id;
console.log(greedyStudent.id);

// -> 연결됐다
