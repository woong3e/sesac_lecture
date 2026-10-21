package com.woong3e.section03.grammar;

import java.util.Locale;

public enum UserRole {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    private UserRole(String description){
        System.out.println("UserRole 생성자 호출 " + description);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getNameToLowerCase(){
        return this.name().toLowerCase();
    }

}
