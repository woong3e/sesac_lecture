class Student {
  // new Student(..)가 실행될 때 자동으로 호출되는 초기화 메서드
  constructor(name, score) {
    this.name = name;
    this.score = score;
  }

  getInfo() {
    return this.name + ": " + this.score + "점";
  }
}

// new 없이 호출하면 TypeError 가 난다.
const student1 = new Student("박지성", 80);
const student2 = new Student("손흥민", 90);

console.log(student1);
console.log(student2);
console.log(student1.getInfo());
console.log(student2.getInfo());

student1.score = 85;
console.log(student1.getInfo());
console.log(student2.getInfo());
