package com.woong3e.section01.user_type;

public class Application1 {
    public static void main(String[] args) {
        // 개별 변수의 한계
        int age = 20;
        String name = "홍길동";

        System.out.println(name + age);

        /*
        * [사용자 정의 자료형 만들기]
        * 1. 객체가 가져야할 데이터와 기능을 클래스로 정의한다.
        * 2. new 연산자를 통해 클래스에 정의된 객체를 생성한다.
        * 3. 생성된 객체를 가리키는 참조 변수를 선언하고 참조값을 저장한다.
        * */
        // 자료형 변수명 = new 클래스명();
        Member member = new Member();

        // 생성된 객체(인스턴스)의 필드(속성)에 값 대입
        // '.'(참조 연산자)를 사용한다.
        member.id = "user01";
        member.pwd ="pwd01";
        member.name = "박지성";
        member.age = 5;
        member.gender ='남';
        member.hobby = new String[]{"축구","풋살","영화"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.gender = " + member.gender);

        for (int i = 0; i < member.hobby.length; i++) {
            System.out.println("member.hobby[i] = " + member.hobby[i] + " ");
        }
        member.age = -5;
        System.out.println(member.age);

    }
}