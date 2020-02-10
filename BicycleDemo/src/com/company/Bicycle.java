package com.company;

public class Bicycle {
    private int cadence;
    private int speed;
    private int gear;


    // public Bicycle() {

    //}

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void speedUp(int increment) {
         speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear: " + gear);
    }

    public void run(int change)
    {
        changeCadence(change);
        speedUp(10);
        changeGear(2);
    }


    @Override
    public String toString()
    {
        return "Cadence: " + cadence + " Speed: " + speed + " Gear: " + gear;
    }

}
