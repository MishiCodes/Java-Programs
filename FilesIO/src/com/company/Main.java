package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream obj = null;
        //try {
            obj = new FileInputStream("abc.txt");
        //} catch (FileNotFoundException e) {
            //e.printStackTrace();
        //}
        System.out.print(obj.available());
    }
}
