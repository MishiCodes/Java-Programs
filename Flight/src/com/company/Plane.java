package com.company;
import java.util.List;

public class Plane {
    private Wing leftWing;
    private  Wing rightWing;
    private Body body;

    public Plane(int wingspan, int noOfSeats) {
        leftWing = new Wing(wingspan / 2);
        rightWing = new Wing(wingspan / 2);
        body = new Body(noOfSeats);
    }

    public void takeoff() {
        startPlane();
        while (leftWing.increaseThrush() || rightWing.increaseThrush());

    }

    public boolean boardAirPlane(List<Passenger> passengers) {
        for (Passenger p : passengers) {
            if (!body.addPassenger(p)) {
                return false;
            }
        }
        return true;
    }

    public void startPlane() {
        leftWing.powerOnEngines();
        rightWing.powerOnEngines();
        body.activateAircondition();
    }



}
