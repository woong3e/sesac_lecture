package com.woong3e.section01.polymorphism;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("토끼가 먹는다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달린다.");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 운다.");
    }

    public void jump(){
        System.out.println("토끼가 뛴다.");
    }
}
