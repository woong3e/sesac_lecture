package com.woong3e.section03.branching;

public class Application1 {
    public static void main(String[] args) {

        /* break
        * 가장 가까운 switch 문 또는 반복문을 종료한다.
        * 라벨이 있으면 지정한 반복문을 종료할수 있다.
        *
        * continue
        * 가장 가까운 반복문의 현재 회차만 중단한다.
        * 다음 조건 검사/증감 단계로 이동한다.
        *
        * return
        * 반복문이 아니라 현재 메서드 전체를 종료한다.
        * */

        Application1 app = new Application1();
//        app.simpleBreak();
//        app.nestedForLoop();
        app.simpleContinue();
    }


    public void simpleBreak(){
        int sum = 0;
        int i = 1;

        while(true) {
            sum += i;
            System.out.println(i);

            if (i == 10) {
                break;  // 가장 가까운 반복문을 즉시 중단하고 탈출
            }
            i++;
        }
        System.out.println("최종 합은 " + sum + "입니다.");

    }

    public void nestedForLoop(){
        // 바깥쪽 for문: 단 (2-9) 제어
        for (int dan = 2; dan <=9 ; dan++) {
            System.out.println(("---" + dan + "단 ---"));
            for (int su = 1; su <=9 ; su++) {
                if(su > 3){
                    break;  // 안쪽 for문을 탈출한다.
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
        }
    }

    // continue -> 다음 반복 회차로 이동
    public void simpleContinue(){
        System.out.println("4와 5의 공배수만 출력한다.");
        for (int i = 1; i <= 100; i++) {
            // 4의 배수이면서 동시에 5의 배수가 아니라면
            if (!(i % 4 == 0 && i % 5 == 0)) {
                continue;   // 이번 반복 회차를 건너뛰고 다음 반복으로 이동한다.
            }
            System.out.println(i);
        }
    }

    // 중첩 반복문 전체를 종료하는 방법
    // 1. 라벨 사용
    public void nestedForLoop2(){
        // 바깥쪽 for문: 단 (2-9) 제어
        woong3e:
        for (int dan = 2; dan <=9 ; dan++) {
            System.out.println(("---" + dan + "단 ---"));
            for (int su = 1; su <=9 ; su++) {
                if(su > 3){
                    break woong3e;  // 라벨이 붙은 반복문을 탈출한다.
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
        }
    }

    // boolean flag 변수 사용
    public void nestedForLoop3(){
        // 바깥쪽 for문: 단 (2-9) 제어

        boolean isBreak = false;

        for (int dan = 2; dan <=9 ; dan++) {
            System.out.println(("---" + dan + "단 ---"));
            for (int su = 1; su <=9 ; su++) {
                if(su > 3){
                    isBreak = true; // 탈출 신호를 보낸다.
                    break;  // 우선 가장 가까운 반복문을 탈출한다.
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            if(isBreak) {
                break;  // 탈출 신호가 있다면 바깥 반복문도 탈출한다.
            }

        }
    }
}
