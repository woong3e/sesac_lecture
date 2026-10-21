package com.greedy.level01.basic;


public class Calculator {

    public void checkMethod(){
        System.out.println("메서드 호출 확인");
    }

    public int sum1to10(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
             sum += i;
        }
        System.out.println("1부터 10까지의 합: " + sum);
        return sum;
    }

    public void checkMaxNumber(int a,int b){
        int result = Math.max(a,b);
        System.out.println("두 수 중 큰 수는 " + result + "이다.");
    }

    public int sumTwoNumber(int a, int b){
        int sum = a + b;
        System.out.println(a + "와 " + b + "의 합은: " + sum);
        return sum;
    }
    public int minusTwoNumber(int a, int b){
        int sum = a - b;
        System.out.println(a + "와 " + b + "의 차는: " + sum);
        return sum;
    }



}
