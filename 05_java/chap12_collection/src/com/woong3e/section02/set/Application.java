package com.woong3e.section02.set;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        /*
        * [Set]
        * 순서를 보장하지 않는다.
        * 중복을 허용하지 않는다.
        *
        * HashSet: 중복제거, 순서보장x
        * LinkedHashSet: 중복제거, 입력순서유지
        * TreeSet: 중복제거, 비교 기준으로 정렬
        * */

        List<String> alist = new ArrayList<>();
        alist.add("java");
        alist.add("mysql");
        alist.add("java");

        Set<String> hset = new HashSet<>();
        hset.add("java");
        hset.add("html");
        hset.add("css");
        hset.add("java");

        System.out.println("ArrayList = " + alist);
        System.out.println("HashSet = " + hset);   // 중복된 java는 하나만 들어감.
        for (String s : hset) {
            System.out.println(s);
        }

        System.out.println("Iterator로 순회");
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){  // 다음에 꺼낼 요소가 있으면 true
            System.out.println(iter.next());// 다음 요소를 꺼냄
        }
    }
}
