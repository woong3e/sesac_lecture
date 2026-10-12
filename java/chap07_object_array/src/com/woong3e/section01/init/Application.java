package com.woong3e.section01.init;

public class Application {
    public static void main(String[] args) {

        Car car1 = new Car("차1",100);
        Car car2 = new Car("차2",200);
        Car car3 = new Car("차3",300);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();

        //        ==================================================         //

        // 객체 배열 선언
        Car[] carArr = new Car[3];
        carArr[0] = new Car("차arr1",100);
        carArr[1] = new Car("차arr2",200);
        carArr[2] = new Car("차arr3",300);

        carArr[0].driveMaxSpeed();

        for (int i = 0; i < carArr.length; i++) {
            carArr[i].driveMaxSpeed();
        }
        System.out.println();


        //        ==================================================         //
        Car[] carArr2 = {
                new Car("차arr2-1", 100),
                new Car("차arr2-2", 200),
                new Car("차arr2-3", 300)};

        for(Car car: carArr2){
            car.driveMaxSpeed();
        }

        //        ==================================================         //

        // 가장 빠른 자동차 찾기 : 객체 배열에 최댓값 탐색 방법 적용
        Car fastestCar = carArr[0];

        for (int i = 1; i < carArr.length; i++) {
            if(carArr[i].getMaxSpeed() > fastestCar.getMaxSpeed()){
                fastestCar = carArr[i];
            }
        }
            System.out.println(fastestCar.getModelName() + "이 가장 빠르며, 시속은 " + fastestCar.getMaxSpeed() + "입니다.");
    }
}
