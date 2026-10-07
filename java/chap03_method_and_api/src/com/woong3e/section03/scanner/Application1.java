package com.woong3e.section03.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // nextLine(): 엔터 키 이전까지 한줄 전체를 문자열로 읽음
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        // next() : 공백문자나 개행문자 전 까지를 문자열로 읽는다.
        System.out.print("인사말을 입력하세요: ");
        String greeting = sc.next();
        System.out.println(greeting);

        // nextInt() : 공백 이전까지의 정수값을 읽음.
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("age = " + age); // 2 5 \n   25 소비.
        sc.nextLine();  // 남은 엔터(\n) 소비한다.
        // nextDouble(): 공백 이전까지의 실수 값을 읽음.

        // 문자를 직접 입력 받는 기능은 제공하지 않는다.
        // 문자열로 입력받고, 원하는 문자를 분리해서 사용해야 한다.
        // java.lang.String의 charAt(index)를 사용한다.

        System.out.println("나이를 입력: ");
        String ageInput = sc.nextLine();
        int age1 = Integer.parseInt(ageInput);
        System.out.println(age1 + "세 입니다.");

        System.out.print("아무 문자나 입력해주세요: ");
        char ch = sc.nextLine().charAt(0);
        System.out.print(ch);

        sc.close(); // 자원 정리

        /*
         * nextInt()  : 정수를 읽어 int로 반환하며, 개행문자(\n)는 남겨둔다.
         * nextLine() : 개행문자(\n) 전까지 한 줄을 읽어 String으로 반환하며, 개행문자도 소비한다.
         *
         * 주의: nextInt() 다음에 nextLine()을 사용하면 남은 개행문자를 먼저 읽을 수 있다.
         * 해결: 중간에 sc.nextLine()을 호출해 남은 개행문자를 소비한다.
         */




    }
}
