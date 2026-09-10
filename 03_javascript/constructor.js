function Person(name, age) {
  this.name = name;
  this.age = age;
  this.getInfo = function () {
    return `${this.name}은 ${this.age}세 입니다.`;
  }; // 인스턴스 메서드
}

Person.prototype.sayHi = function () {
  console.log(`hi ${this.name}은 ${this.age}`);
}; // 프로토타입 메서드

Person.sayBye = function () {
  console.log('bye');
}; //정적 메서드

const person1 = new Person('박지성', 30);
const person2 = new Person('손흥민', 20);

console.log('같은 객체인가?', person1 === person2); // false : 객체는 참조를 비교하기 때문에 false가 나온다.
console.log('같을까요?', person1.sayHi === person2.sayHi); // true : sayHi 라는 프로토타입 메서드는 하나뿐임.
console.log('같을까요?', person1.getInfo === person2.getInfo); // false : 인스턴스 메서드는 인스턴스를 생성할때마다 생긴다.
Person.sayBye(); // 정적 메서드로,클래스로 호출하고,인스턴스를 생성하지 않고도 호출할 수 있다.
