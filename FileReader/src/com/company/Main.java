package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    readFile("file.txt");
    }
    private static File openTxtFile(String fileName) throws IllegalArgumentException {
        if (!fileName.endsWith(".txt")){
            throw new IllegalArgumentException();
        }
        return new File(fileName);
    }

    public static String readFile(String fileName) throws IllegalArgumentException {
        StringBuilder data = new StringBuilder();
        try {
            File file = openTxtFile(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) data.append(sc.nextLine());
        } catch (FileNotFoundException fnfexception) {
            throw new IllegalArgumentException();
        }
        return data.toString();
    }

}
