package com.hw1.model.dto;

public class Student extends Person {

    private int grade;
    private String major;

    public Student() {
        super();    // 기본생성자에 super는 생략하든 명시하든 동일하게 동작한다.
    }

    public Student(String name, int age, double height, double weight,int grade, String major) {
        super(age, height, weight);
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String information(){
        return name + " " + getAge() + " " + getHeight() + " " + getWeight() + " " + grade + " " + major + " ";
    }
}
