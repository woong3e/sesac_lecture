package com.woong3e.section07.kindsofvariable;

public class KindsOfVariable {

    /*
    * 클래스 영역에 작성하는 변수를 필드라고 합니다.
    * */

    // 인스턴스 변수(non-static) 는 객체마다 따로 만들어지며 객체가 존재하는 동안 유지된다.
    // new 로 객체를 만들 때 Heap 메모리에 생성된다.
    // 같은 클래스 내 어느 메서드에서든 접근 가능하다.
    // 객체가 살아있는 동안에만 존재한다.
    private int instanceNum;

    // static 변수(클래스 변수)는 클래스가 초기화될 때 하나 만들어지며 같은 클래스 모든 객체가 공유한다.
    // 프로그램 시작 시 static 영역에 하나만 생성된다.
    // 모든 인스턴스(객체)가 공유하며 프로그램 종료시까지 사라지지 않는다.
    // static 이라는건 특정 메모리 영역을 말하는게 아니라 객체가 아닌 클래스에 소속된다 라는 의미의 키워드이다.
    // 따라서 static 을 이해할때는 저장 위치보다 인스턴스를 생성하지 않아도 클래스 이름으로 접근할 수 있고,
    // 해당 클래스의 인스턴스들이 공유하는 멤버이다.
    private static int staticNum;

    /* 지역 변수 -> 메서드 안에 선언하는 변수*/
    public void method(int num){
        // num : 매개변수도 지역변수의 일종

        // 메서드가 호출될 때 Stack 메모리에 생성된다.
        // '}' 를 만나는 순간 즉시 사라진다.
        int localNum;
        System.out.println(num);
//        System.out.println(localNum); // 초기화 전 사용 불가

        // 인스턴스 변수: 같은 클래스 내 어디서든 접근 가능하다.
        System.out.println(instanceNum);
        // 클래스 변수: 프로그램 전체에서 접근 가능하다.
        System.out.println(staticNum);
    }

    public void method2(){
        System.out.println(instanceNum);
        System.out.println(staticNum);
//        System.out.println(localNum);   // 지역 변수는 해당 지역에서만 사용이 가능하다.
    }
}

// >> 인스턴스 변수는 객체별로, 클래스 변수는 공통으로, 지역 변수는 선언한 블록 안에서 사용한다.