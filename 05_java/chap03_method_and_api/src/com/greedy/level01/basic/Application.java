package com.greedy.level01.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        cal.checkMethod();
        cal.sum1to10();
        cal.checkMaxNumber(1,20);
        System.out.print("수 2개 입력: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal.sumTwoNumber(a,b);
        System.out.print("수 2개 입력: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        cal.minusTwoNumber(c,d);
    }
}
