package com.woong3e.section01.extend;

public class RacingCar extends Car{
    @Override
    public void run() {
        super.run();    // 부모의 메서드 호출
        System.out.println("RacingCar 가 달린다");
    }
}
