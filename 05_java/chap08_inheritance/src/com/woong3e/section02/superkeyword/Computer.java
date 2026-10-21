package com.woong3e.section02.superkeyword;

public class Computer extends Product {

    // 상속받으면 부모의 필드도 사용가능하고 필요하면 자식에서 추가함.
    private String cpu;
    private int ram;

    public Computer(){
        super();
        System.out.println("Computer 기본 생성자 호출");
    }

    // 부모와 자식 필드를 모두 초기화하는 생성자
    public Computer(String code, String name, int price,String cpu,int ram){
        super(code,name,price);
        this.cpu = cpu;
        this.ram = ram;
        System.out.println("Computer 매개변수 있는 생성자 호출");
    }

    @Override
    public String getInformation() {
        String parentInfo = super.getInformation();
        String ComputerInfo = " " + cpu + " " + ram;
        return parentInfo + ComputerInfo;
    }
}
