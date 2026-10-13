package com.woong3e.section01.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 먹는다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 달린다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 운다.");
    }

    public void bite(){
        System.out.println("호랑이가 문다");
    }
}
