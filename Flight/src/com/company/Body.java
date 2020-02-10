package com.company;
import java.util.ArrayList;
import java.util.List;

public class Body {
    private int seats;
    private int temperature;
    private List<Person> passengers;
    private List<Baggage> baggage;

    public Body(int noOfSeats){
        seats = noOfSeats;
        temperature = 20;
        passengers = new ArrayList<>();
        baggage = new ArrayList<>();
    }

    public boolean addPassenger(Person pass){
        if (passengers.size() < seats) {
            passengers.add(pass);
        }
        return false;
    }
}
