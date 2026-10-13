package com.woong3e.section03.interfaceimplements;

public interface IConnectable {
    public abstract void connect();

    // 인터페이스의 추상 메서드에는 public abstract 가 자동으로 적용된다.(생략)
    void disconnect();
}


/*[인터페이스]
* 클래스가 반드시 구현해야 할 기능의 규칙을 정의한다.
*
* interface 키워드로 선언
* 직접 객체를 생성할 수 없음
* 클래스는 implements 키워드로 인터페이스를 구현
* 구현 클래스는 인터페이스에 있는 추상 메서드를 반드시 오버라이딩 해야한다.
* 인터페이스 타입으로 구현 객체를 참조할 수 있다.(다형성)
* 여러 인터페이스를 동시에 구현할 수 있다.
*
* */

/*
* 추상 클래스: 공통 속성과 기능을 물려주는 미완성 부모 클래스
* 인터페이스: 구현 클래스가 지켜야할 기능의 약속
* */

/* 추상클래스 / 인터페이스 비교해서 표로 정리*/