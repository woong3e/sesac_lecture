package com.woong3e.section03.overriding;

public class CoffeeVendingMachine extends VendingMachine {

    /*[오버라이딩 성립 조건]
    * 메서드 이름과 매개변수 목록이 부모와 동일해야 한다.
    * 반환 타입도 부모와 동일하게 작성하는 것이 기본이다.(부모 반환타입의 자식타입이라면 가능하다.)
    * 접근제한자는 부모와 같거나 더 넓어야 한다.
    * ( private < default < protected < public )
    * */

    /*[오버라이딩 불가 대상]
    * 1. private
    * 2. final
    * 3.
    * */


    // 더 넓은 범위로의 접근제한자는 오버라이딩 가능하다.
    @Override
    public void clean(){
        System.out.println("커피 자판기 내부를 청소합니다.");
    }


    /*
    * [오버라이딩이 성립하지않는 경우]
    * 1. 반환형이 다른 경우
    * */
    @Override
    public String vend(){
        return "아이스 아메리카노";
    }
    // 1. 반환형이 다른 경우
//    @Override
//    public int vend(){
//        return 3;
//    }

    // 2. 매개변수가 다른 경우
//    @Override
//    public String vend(String type){
//        return type;
//    }

    // 3. private 메서드
//    @Override
//    private void checkStock(){
//        System.out.println("자판기 재고를 확인합니다.");
//    }

    // 4. final 메서드
//    public final void powerOn(){
//        System.out.println("자판기 전원을 켭니다.");
//    }

    // 5. 접근 범위를 축소하는 경우
//    @Override
//    void clean(){}
}
