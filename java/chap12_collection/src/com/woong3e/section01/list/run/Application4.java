package com.woong3e.section01.list.run;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application4 {
    public static void main(String[] args) {
        Deque<Integer> integerStack = new ArrayDeque<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack = " + integerStack);

        /*peek: 가장 꼭대기 요소를 확인
        * pop: 가장 꼭대기 요소를 꺼내면서 삭제
        * */
        System.out.println("peek(): " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);

        while(!integerStack.isEmpty()){
            System.out.println("꺼낸 값: " + integerStack.pop());
        }
        // System.out.println(integerStack.pop()); // pop()은 비어있는 경우에 Exception 발생

        /* Stack
        * 후입선출(LIFO) 방식의 자료구조이다.
        *
        * 웹 브라우저의 '뒤로가기' 기능
        * 프로그램의 '실행취소' 기능
        *
        * 자바에 오래된 Stack 클래스도 있지만 현재는 Deque 인터페이스의 구현체인
        * ArrayDeque를 스택처럼 사용하는 방식이 일반적이다.
        * Deque는 양쪽 끝에서 값을 넣고 뺄 수 있지만 여기서는 한쪽 끝만 사용했다.
        * */

    }
}
