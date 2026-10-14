package com.woong3e.section01.generic;

public class Application {
    public static void main(String[] args) {

        /*
        * [제네릭]
        * 클래스나 메서드에서 사용할 자료형을 미리 고정하지 않고
        * 사용하는 시점에 결정하는 문법
        *
        * 타입별 중복 코드를 줄이고
        * 잘못된 타입의 데이터가 들어오는 것을 방지한다.
        *
        * */

        NormalBox normalBox = new NormalBox();

        normalBox.setContent("안녕하세요");
        String content = (String) normalBox.getContent();   // 제네릭이 없으면 다운캐스팅 해야 돼.

//        normalBox.setContent(123);      // 런타임 오류 발생
        // Object에는 숫자도 저장할 수 있어 자체 컴파일 오류가 발생하지 않는다.
        // 하지만 런타임 시점에 숫자를 String으로 바꾸려는 순간 ClassCaseException이 발생한다.
//        String wrongContent = (String) normalBox.getContent();


        GenericBox<String> stringBox = new GenericBox<>();
        
        stringBox.setContent("하이");
//        stringBox.setContent(123);    // incompatible types 호환되지않는타입
        String strContent = stringBox.getContent();     // 제네릭은 다운 캐스팅 할 필요 없음. String으로 정해졌기 때문이다.
        System.out.println("strContent = " + strContent);

        GenericBox<Integer> integerBox = new GenericBox<>();
        // 타입 인자를 지정할 때 Integer 를 사용해야한다. 기본형은 사용 x, 기본형을 사용할 수 없는 이유는 제네릭은 참조 타입을 대상으로 설계되었기 때문이다.
        integerBox.setContent(123);
        int intContent = integerBox.getContent();
        System.out.println("intContent = " + intContent);
        
        
    }
}
