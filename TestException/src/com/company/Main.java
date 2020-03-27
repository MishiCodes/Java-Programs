package com.company;

import static com.company.Test.test;

public class Main {

    public static void main(String[] args) {
        try {
            test();
        }
        catch (RuntimeException ex) {
            System.out.print("runtime");
        }
        System.out.print("end");
    }
    }
