package com.woong3e.section01.array;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
    /* 1. 배열 선언
    * int 배열 객체를 가리킬 수 있는 참조 변수만 준비한다.
    * */
        int[] iarr;  // 더 권장되는 방식
        char carr[];


        /* 2. 배열 할당
        * new int[5] - 힙 영역에 int값 다섯 개를 저장할 배열 객체를 만든다.
        * new 가 반환한 참조값은 iarr 에 저장하므로 iarr 을통해 배열 객체에 접근할 수 있다.
        * */
        iarr = new int[5];

        // 선언과 동시에 할당한다.
        int[] iarr2 = new int[5];   // 다섯칸의 배열을 만들고 기본값으로 초기화한다.

        int[] iarr3 = new int[]{11,22,33,44,55};

        // 선언과 동시에 할당하는 경우 new 연산자 생략 가능
        int[] iarr4 = {11, 22, 33, 44, 55};

        /*
        * 값을 넣지 않으면 자료형에 맞는 기본값으로 채워진다.
        * 정수는 0, 실수는 0.0, 논리형은 false, 문자형은 \u0000, 참조형은 null이다. <<<기본값들
        * */

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(i + " 번 인덱스의 값: " + iarr[i]);
        }

        iarr[0] = 10;
        iarr[1] = 20;
        iarr[2] = 30;
//        iarr[5] = 60; // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5


        for (int i = 0; i < iarr.length; i++) {
            System.out.println(i + " 번 인덱스의 값: " + iarr[i]);
        }

        // 문자열도 배열로 사용 가능하다.
        String[] sarr = {"apple","banana","orange","watermelon"};

        for (int i = 0; i < sarr.length; i++) {
            System.out.println(i + " 번 인덱스의 값: " + sarr[i]);
        }

        // java에서 배열 찍어보려면 Arrays.toString()을 사용한다.
        System.out.println(Arrays.toString(sarr));  // [apple, banana, orange, watermelon]



    }
}
