package com.woong3e.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception{

        /*
        * throw: 현재 위치에서 예외 객체를 직접 던진다.
        * throws: 이 메서드가 처리하지 않은 예외를 호출한 곳으로 위임한다.
        * 여기서 처리하지 않을거니까 호출하는 쪽에서 처리해라. 라는 뜻
        * */

        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");
        if (money >= price) {
            System.out.println("상품을 구입하기 위한 돈이 충분합니다.");
        }
        else {
            throw new Exception("돈이 부족해요.");
        }

        System.out.println("즐거운 쇼핑하세요.");
    }
}
