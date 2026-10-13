package com.woong3e.section01.extend;

public class FireCar extends Car{

    public FireCar(){
        super(); // 부모 클래스의 기본 생성자를 호출
        System.out.println("FireCar 클래스 기본 생성자 호출");
    }

    /*
    * 오버라이딩
    * 부모에게 물려받은 메서드를 자식의 목적에 맞게 같은 형태로 다시 작성하는 것
    * 부모 메서드를 제대로 덮어썼는지 문법 검사 요청*/
    @Override
    public void soundHorn(){
        if(isRunning()){
            System.out.println("FireCar 경적 울린다");
        }else{
            System.out.println("FireCar가 멈춰있다");
        }
    }

    public void sprayWater(){
        System.out.println("물 뿌리기");
    }
}
