package com.woong3e.section02.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        
    
    
    /*
    * [LinkedHashSet]
    * '중복불가'의 특징은 그대로 유지
    * 요소가 입력된 순서를 기억하여, 순서를 유지하는 특징이 있다.
    * */

    Set<String> hset = new HashSet<>();
        hset.add("java");
        hset.add("html");
        hset.add("css");
        hset.add("java");

        Set<String> lhSet = new LinkedHashSet<>();
        lhSet.add("java");
        lhSet.add("html");
        lhSet.add("css");
        lhSet.add("java");
        System.out.println("hset = " + hset);
        System.out.println("lhSet = " + lhSet);



    }
}
