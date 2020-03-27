package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] myTestValues = new int[10];
        for (int i = 0; i < 10; i++) {
            myTestValues[i] = random.nextInt();

        }
        System.out.println(Arrays.toString(myTestValues));
    }
}

