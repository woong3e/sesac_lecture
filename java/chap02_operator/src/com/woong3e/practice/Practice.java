package com.woong3e.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {



//    - 실습문제 1
//
//    두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
//
//    두 수 중 큰 수를 출력하는 프로그램을 작성해본다.
//
//            ---
//
//    출력예시
//
//    두 수 중 큰 수는 20입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력해주세요.");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요.");
        int num2 = sc.nextInt();
        int result = num1 > num2 ? num1 : num2;
        System.out.println("두 수 중 큰 수는 " + result + "입니다.");

//
//            - 실습문제 2
//
//    정수형 변수를 선언하여 점수를 저장하고,
//
//    삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
//
//    그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.
//
//            ---
//
//    출력예시
//
//    합격입니다~~!!!
//
//    또는 아쉽지만 불합격입니다….
        System.out.print("점수를 입력해주세요: ");
        int a = sc.nextInt();
        String result1;
        result1 = a >=60 ? "합격입니다." : "아쉽지만 불합격입니다.";
        System.out.println(result1);
//
//            - 실습문제 3
//
//    정수형 변수를 선언하고, 삼항연산자를 사용하여
//
//    입력된 수가 짝수인지 홀수인지 출력하는 프로그램을 작성해본다.
//
//    /* 참고사항 : 조건식에 %를 활용하여 짝수인지 홀수인지를 판단해 보세요~~ */
//
//    ---
//
//    출력예시
//
//    입력하신 수는 짝수입니다.
//
//    또는 입력하신 수는 홀수입니다.

        System.out.print("숫자를 입력해주세요.: ");
        int numA = sc.nextInt();
        String result3 = numA % 2 == 0 ? "짝수" : "홀수";
        System.out.println("입력하신 수는 " + result3 + "입니다.");
//
//            - 실습문제 4
//
//    실수를 변수로 선언하여 점수를 저장하고, 이를 정수로 변환하여
//
//    점수가 90점 이상이면 ”A”,
//
//            80점 이상이면 “B”,
//
//            70점 이상이면 “C”,
//
//            60점 이상이면”D
//
//    60점 미만이면 “F”를 출력하는 프로그램을 작성해본다.
//
//            ---
//
//    출력예시
//
//    홍길동의 이번 점수등급은 B입니다.

        System.out.print("점수를 입력해주세요(실수 입력): ");
        double score;
        score = (int)sc.nextDouble();
        switch ((int)score / 10){
                case 10,9-> System.out.println("A");
                case 8-> System.out.println("B");
                case 7-> System.out.println("C");
                case 6-> System.out.println("D");
                default-> System.out.println("F");
        }
//
//            - 실습문제 5
//
//    정수형 변수를 두개 선언하여 회원의 월(month)과 일(day)를 저장합니다.
//
//    월이 1월부터 6월까지이면서, 일이 1일부터 15일까지인 경우 “배민 쿠폰”을,
//
//    월이 7월부터 12월까지이면서, 일이 16일부터 31일까지인 경우 “스타벅스 커피”를
//
//    그 외의 경우는 “사탕”이 선물로 선택되는 프로그램을 작성해본다.
//
//    ---
//
//    출력예시
//
//    “본인이름”의 선물은 스타벅스 커피 입니다.
//
//            또는 “본인이름”의 선물은 사탕 입니다.



        System.out.print("생일의 달을 입력해주세요: ");
        int month = sc.nextInt();
        System.out.print("생일의 일을 입력해주세요: ");
        int day = sc.nextInt();

        String result5;
        if( (month>=1 && month <=6) && (day>=1 && day<=15)){
             result5 = "배민 쿠폰";
        } else if ((month >= 7 && month <= 12) && (day >= 16 && day <= 31)) {
            result5 = "스타벅스 커피";
        }else{
            result5 ="사탕";
        }
        System.out.println("박지성의 선물은 " +result5 +"입니다");


    }
}

