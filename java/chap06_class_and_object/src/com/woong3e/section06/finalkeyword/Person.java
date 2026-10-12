package com.woong3e.section06.finalkeyword;

public class Person {

    // final 인스턴스 필드: 객체 생성 시 딱 한 번 결정, 이후 변경 불가

    final String ssn; // 주민등록번호, 선언만 한 상태
    private String name;

    // final 필드는 반드시 '생성자'에서 초기화해야 한다.
    // (➡️Person 클래스 안에서 ssn의 초기값을 정해야 한다는 뜻)
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}