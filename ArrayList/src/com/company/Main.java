package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        ListIterator it = list.listIterator();

        list.add("first");
        list.add("Second");
        //foreach loop
        String result="";
        for (String x : list) {
            //list.add("new"); can't
            //list.remove(x);--
            //list.add(0,"new");--
            //list.remove();
            result +=  x;

        }
        while (it.hasNext()) {
            //String elem = (String)it.next();
            it.add("new");
        }
        System.out.println(list);
    }
}
