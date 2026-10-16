package com.woong3e.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        /*
        * 컬렉션 프레임워크
        * 여러 개의 데이터(객체)를 효과적으로 관리하기 위해 자바에서 제공하는 클래스들의 묶음
        * 크게 List, Set, Map 인터페이스로 분류된다.
        * */

        /*
        * ArrayList
        * List 인터페이스의 가장 대표적인 구현 클래스
        * 데이터에 순서(인덱스)가 있고, 중복된 데이터 저장을 허용한다.
        * */

        List alist = new ArrayList();
        alist.add("apple");
        alist.add(123);
        alist.add(45.55);
        alist.add(false);

        System.out.println(alist);
//      String fruit = alist.get(0);    //java: incompatible types: java.lang.Object cannot be converted to java.lang.String
        // 제네릭을 지정하지 않으면 리스트에 저장된 요소들이 Object로 취급된다.
        // 따라서 값을 꺼내서 원래 타입으로 사용하려면, 매번 형변환을 해야한다. 그니까 그냥 제네릭 써라.
        String fruit = (String) alist.get(0);
        System.out.println("fruit = " + fruit);

        List<String> stringList = new ArrayList<>();

        stringList.add("apple");
//      stringList.add(123);
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("mango");

        System.out.println("stringList = " + stringList);

        // get(인덱스): 해당 위치의 값을 조회합니다.
        System.out.println(stringList.get(0));
        // set(인덱스, 값): 해당 위치의 값 수정
        stringList.set(0,"watermelon");
        System.out.println("set(0,watermelon) " + stringList);
        // remove(인덱스 또는 값): 해당 위치 또는 해당 값 삭제
        stringList.remove("orange");
        System.out.println("remove orange " + stringList);
        // size(): 현재 저장된 요소 개수 확인
        System.out.println(stringList.size());


        // 문자열 목록 정렬하기
        /* [ Collections 클래스 ]
        * 컬렉션을 다루는데 유용한 static 메서드들을 제공하는 유틸리티 클래스
        * Collection 인터페이스와는 다르다.
        * */

        // sort 오름차순 정렬
        Collections.sort(stringList);
        System.out.println("오름차순 stringList = " + stringList);

        // sort 내림차순 정렬
        // List 인터페이스에서 제공하는 sort 메서드에 Comparator.reverseOrder()를 인자로 전달한다.
        stringList.sort(Comparator.reverseOrder());
        System.out.println("내림차순 stringList = " + stringList);
    }
}
