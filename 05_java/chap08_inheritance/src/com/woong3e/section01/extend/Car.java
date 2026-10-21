package com.woong3e.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스 기본 생성자 호출");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달린다");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춘다");
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("경적을 울린다");
        } else {
            System.out.println("주행중이 아닙니다");
        }
    }

    protected boolean isRunning() {
        return runningStatus;
    }
}

/*
* protected: 같은 패키지에서 접근할 수 있으며,
* 다른 패키지에서는 상속받은 자식 클래스가 사용할 수 있다.
* */