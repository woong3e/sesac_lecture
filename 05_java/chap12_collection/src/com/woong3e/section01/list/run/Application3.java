package com.woong3e.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        /*[ LinkedList ]
        * ArrayList는 내부적으로 배열을 이용하는 것과 달리, LinkedList는 '이중 연결 리스트' 방식으로 데이터를 관리한다.
        * 각 요소는 자신의 앞/뒤 요소만 기억한다.
        *
        * ArrayList: 인덱스 접근이 빠르고 메모리 효율이 좋아 일반적인 리스트 관리에 적합.
        * LinkedList: 노드 연결 방식으로 양 끝 삽입·삭제가 빠르지만, 인덱스 조회는 느림.
        *
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("grape");
        linkedList.add("grape");

        System.out.println(linkedList);
        System.out.println(linkedList.get(1));

    }
}
