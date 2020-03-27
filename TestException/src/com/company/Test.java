package com.company;

public class Test {
    static void test() throws RuntimeException {
        try {
            System.out.print("test ");
            throw new RuntimeException();
        } catch (Exception ex) {
            System.out.print("exception ");
        }
    }
}
