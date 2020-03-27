package com.company;

public class Main {

    public static void main(String[] args) {
        InSet set = new InSet();
        set.add(2);
        set.remove(10);
        System.out.format("The set contains %d elements\n", set.size());

        //set.add(2);
        //set.add(3);
        //set.add(2);
        //System.out.format("The set contains %d elements\n", set.size());
        //set.remove(2);
        //set.remove(3);
        //System.out.format("The set contains %d elements\n", set.size());

    }
}
