package com.woong3e.section02.looping;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Application1 app = new Application1();
//        app.whyLoops();
//        app.forLoopSum();
//        app.nestedForLoop();
//        app.whileLoop();
        app.dowhileLoop();
    }


    public void whyLoops(){

        /* for문의 초기식, 조건식,증감식 구조는 JS와 같다.
        *  자바에서는 반복제어변수의 자료형을 함께 작성한다.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("1 번째 학생의 이름 입력: ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        System.out.println("2 번째 학생의 이름 입력: ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");

        for (int i = 3; i <= 5 ; i++) {
            System.out.println(i + "번째 학생의 이름 입력: ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");

        }
    }
    // 누적 합계 구하기
    public void forLoopSum(){
        // 1부터 사용자가 입력한 숫자까지 합계 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("합계를 구할양의 정수를 입력: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum);

    }
    // 구구단 (중첩 for문)
    public void nestedForLoop(){
        // 바깥쪽 for문: 단 (2-9) 제어
        for (int dan = 2; dan <=9 ; dan++) {
            System.out.println(("---" + dan + "단 ---"));
            for (int su = 1; su <=9 ; su++) {
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
        }
    }
    // while 문 - 반복 횟수가 불명확할 때 사용한다.
    public void whileLoop(){
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (!str.equals("exit")){
            System.out.println("문자열을 입력하세요('exit' 입력시 종료): ");
            str = sc.nextLine();
            System.out.println("입력한 문자열: " + str);
        }
        System.out.println("프로그램을 종료합니다.");
    }
    // do-while 문 - 최소 한 번 실행해야할 때.
    public void dowhileLoop(){

        Scanner sc = new Scanner(System.in);
        String str;

        do{
            System.out.println("문자열을 입력하세요.");
            str = sc.nextLine();
            System.out.println("입력한 문자열: " + str);


        } while(!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");


    }
}
