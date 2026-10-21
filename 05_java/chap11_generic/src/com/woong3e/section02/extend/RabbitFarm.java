package com.woong3e.section02.extend;

// <T extends Rabbit>: Rabbit 또는 Rabbit의 자식 타입만 오도록 제한
// RabbitFarm 이라는 객체를 생성할 때 들어갈 타입을 제한한다고 생각하면 돼
public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
