package com.company;

public class Main {

    public static void main(String[] args) {
        Double number = -5.5;
        String result;

        result = (number > 0.0 && number > -1) ? "First value" : "Second value";
        System.out.println("Output is :" + result);
    }
}
