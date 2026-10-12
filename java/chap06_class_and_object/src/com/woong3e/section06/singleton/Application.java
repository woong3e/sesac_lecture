package com.woong3e.section06.singleton;

public class Application {
    public static void main(String[] args) {
        // EagerSingleton eager1 = new EagerSingleton();    // 생성자가 private이라 접근 불가.
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println(eager1 == eager2);

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println(lazy1 == lazy2);

        // 객체를 몇번 호출하더라도 항상 동일한 인스턴스를 반환한다 << 는게 중요. 즉 하나의 객체를 공유한다는 것.
        // 그런데 왜 하나만 만들어야할까?
        // 예를 들어, 설정 관리 객체를 여러개 생성하는 대신 하나만 만들어서 공유하면, 여러곳에서 동일한 설정 상태를 참조할 수 있음.
        // 애플리케이션 설정 관리, 로깅(logger)관리, 공유 캐시 관리, 특정 리소스 관리자 <<< 가 그 사례임


        // 한 줄 설명>> 싱글톤 패턴이란 클래스의 객체를 하나만 생성하고, 여러 곳에서 그 객체를 공유하도록 하는 설계 패턴이다.
    }
}
