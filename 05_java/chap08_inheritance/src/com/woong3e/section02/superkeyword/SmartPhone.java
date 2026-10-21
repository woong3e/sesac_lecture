package com.woong3e.section02.superkeyword;

//Product 클래스를 상속 받는다.
public class SmartPhone extends Product{
    // Product 클래스를 상속받는다.
    private String agency;

    // 부모 필드 포함 모든 필드를 초기화 하는 생성자
    public SmartPhone(String code, String name, int price, String agency) {
        super(code, name, price);
        this.agency = agency;
    }

    // getInformation() 메서드 오버라이딩
    @Override
    public String getInformation() {
        return super.getInformation() + " " + agency;
    }

}
