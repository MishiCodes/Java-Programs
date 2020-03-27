package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileInputStream in = new FileInputStream("poem.txt");

            int c;
            try {
                while ((c = in.read()) != -1) {
                    System.out.print(c);
                }
                in.close();
            } catch (IOException e1) {

                System.out.println(e1);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println(e);
        }

    }
}

