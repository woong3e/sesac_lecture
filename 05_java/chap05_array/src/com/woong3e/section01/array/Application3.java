package com.woong3e.section01.array;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        /* 5명의 자바 점수를 정수로 입력받아 합계와 평균을 실수로 구하는 프로그램 만들기
        *
        * 1. 5명의 점수를 저장할 배열을 할당한다.
        * 2. 키보드로 점수를 입력받는다.
        * 3. 합계와 평균을 계산한다.
        * 4. 합계와 평균 출력
        * */

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int[] scoresArr = new int[5];
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.print(i+1 + "번째 학생의 자바 점수를 입력하세요: ");
            scoresArr[i] = sc.nextInt();
            sum += scoresArr[i];
            avg = sum / (double) scoresArr.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
