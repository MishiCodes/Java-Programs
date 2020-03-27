package com.company;
import java.util.ArrayList;
import java.util.List;

public class Body {
    private boolean airConditionerPower;
    private int seats;
    private int temperature;
    private List<Person> passengers;
    private List<Baggage> storage;

    public Body(int noOfSeats){
        seats = noOfSeats;
        temperature = 20;
        passengers = new ArrayList<>();
        storage = new ArrayList<>();
    }

    public boolean addPassenger(Passenger pass){
        if (passengers.size() < seats) {
            passengers.add(pass.person);
            storage.add(pass.baggage);
            return true;
        }
        return false;
    }

    public void activateAircondition() {
        airConditionerPower = true;
    }
}
