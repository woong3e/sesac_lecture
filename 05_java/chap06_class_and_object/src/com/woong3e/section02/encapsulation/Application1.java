package com.woong3e.section02.encapsulation;

public class Application1 {
    public static void main(String[] args) {

        /* [캡슐화]
        * 필드를 public으로 열어두면 외부 코드가 객체의 상태를 원하는 값으로 직접 바꿀 수 있다.
        * 캡슐화는 필드를 private 으로 감추고 객체가 제공하는 메서드를 통해 접근하게 하는 방식이다.
        * */

        Children child1 = new Children();
//        child1.nickname = "박지성";
//        child1.age = -10;
//        System.out.println("child1.nickname = " + child1.nickname);
//        System.out.println("child1.age = " + child1.age);

        child1.setAge(-10);
        child1.setNickname("박지성");

        System.out.println(child1.getAge());
        System.out.println(child1.getNickname());

    }
}
