package com.woong3e.section01.exception;

public class Application {
    // 호출하는 곳에서도 throws Exception이 있음 -> JVM이 처리한다.
    public static void main(String[] args) throws Exception {

//        int number = Integer.parseInt("abc");

        /*
        * [예외처리(Exception Handling)]
        * 프로그램 실행 중 발생 문제를 감지하고 안내/기록/복구 방법을 정하는 것
        *
        * */

        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.checkEnoughMoney(10_000,30_000);
        exceptionTest.checkEnoughMoney(50_000,30_000);

        System.out.println("프로그램을 종료합니다.");
    }
}
