package com.woong3e.section01.init;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car(String modelName,int maxSpeed){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed(){
        System.out.println(this.modelName + "이 " + this.maxSpeed + "km/h로 달려갑니다.");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
