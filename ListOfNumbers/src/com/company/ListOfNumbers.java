package com.company;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    //public void writeList() throws IOException {
        //PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        //for (int i = 0; i < 10; i++) {
            //out.println("Value at: " + i + " = " + list.get(i));
        //}
        //out.close();
    //}
    public void writeList() {
        PrintWriter out = null;
        try {
// Exception thrown somewhere within this block
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < 10; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } // End of try block
        catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}