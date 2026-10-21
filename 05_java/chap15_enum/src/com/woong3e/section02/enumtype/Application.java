package com.woong3e.section02.enumtype;

import javax.security.auth.Subject;

public class Application {
    public static void main(String[] args) {

        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;
        if (subject1 == subject2) {
            System.out.println("같은 과목이다.");
        } else {
            System.out.println("다른 과목이다.");
        }
        System.out.println(subject1 instanceof Subjects);
        System.out.println(subject2 instanceof Subjects);

//      printSubject(2);    // Subjects 타입이 아니므로 전달 불가
        printSubject(Subjects.HTML);

        //선언된 상수 순회하기
        for (Subjects subject : Subjects.values()) {
            // subject.ordinal(): 현재 상수의 선언위치를 0부터 반환한다. Subjects.java <<여기에 선언된 순서대로.
            System.out.println((subject.ordinal() + 1) + ". " + subject.name());
        }
    }


    public static void printSubject(Subjects subjects){
        System.out.println("전달받은 과목: " + subjects.toString());
    }

}
