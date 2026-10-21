package com.woong3e.section01.conditional;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Application1 app = new Application1();
//        app.testSimpleIf();
//        app.testIfElse();
//        app.testIfElseIf();
//        app.testSwitch();
        app.testEnhancedSwitch();
    }

    // 1. if
    public void testSimpleIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한개를 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");

    }

    public void testIfElse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }

    }

    public void testIfElseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 점수를 입력: ");
        int point = sc.nextInt();
        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        }else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 50) {
            grade = "D";
            if (point >= 55) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
            System.out.println("점수는 " + point + "이고 " + grade + "입니다.");
    }
    // switch
    public void testSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 (+, -): ");
        char operator = sc.next().charAt(0);

        int result = 0;
        switch (operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            default:
                System.out.println("잘못된 연산 기호를 입력하셨습니다.");
                return;
        }
        System.out.println(first + " " + operator + " " + second + " = " + result);
    }

    // 최신 switch java 14+  "switch 표현식"
    public void testEnhancedSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 (+, -): ");
        char operator = sc.next().charAt(0);

        int result = switch (operator) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            default -> {
                System.out.println("잘못된 연산 기호를 입력하셨습니다.");
                yield 0;    // 중괄호로 작성한 case에서 값을 반환할 때 yield 를 사용한다.
                // return 은 메서드 전체를 종료하지만 yield 는 switch 결과값만 정한다.
            }
        };
        System.out.println(first + " " + operator + " " + second + " = " + result);
    }

}

