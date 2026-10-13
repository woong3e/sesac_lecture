package com.woong3e.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();

        System.out.println(product.getInformation());

        Product product2 = new Product("s-123","갤럭시",1_000_000);
        System.out.println(product2.getInformation());

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("c-123","컴퓨터",2_000_000,"i5",32);
        System.out.println(computer2.getInformation());

//        SmartPhone smartPhone1 = new SmartPhone();
            // 매개 변수가 있는 생성자를 정의했다면 기본 생성자도 정의해주어야 오류안남. 얘는 정의안해서 오류남.
//        System.out.println(smartPhone1.getInformation());

        SmartPhone smartPhone2 = new SmartPhone("p-123","아이폰",1_500_000,"SK");
        System.out.println(smartPhone2.getInformation());
    }
}
