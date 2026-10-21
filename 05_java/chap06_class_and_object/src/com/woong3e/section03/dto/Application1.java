package com.woong3e.section03.dto;

public class Application1 {
    public static void main(String[] args) {


        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("지성");
        member.setAge(40);
        member.setGender('남');
        member.setHeight(175);
        member.setActivated(true);

        System.out.println(member.getAge());
        System.out.println(member.getName());

    }
}
