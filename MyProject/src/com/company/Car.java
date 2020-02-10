package com.company;

public class Car {
    private String color;
    private int speed;

    public Car(String color) {
        color = color;
    }

    public void drive(){
        speed ++;
        System.out.println("Speed is: " + speed);
    }
}
