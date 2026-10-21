package com.woong3e.section03.grammar;

public class Application {
    public static void main(String[] args) {

        UserRole admin = UserRole.ADMIN;    // 여기서 new로 객체 생성함.
        UserRole guest = UserRole.GUEST;    // 여기는 객체를 참조만 한다. 여기서는 생성자 호출안돼.
        System.out.println(admin.name());
        System.out.println(admin.getDescription());
        System.out.println(admin.getNameToLowerCase());

    }
}
