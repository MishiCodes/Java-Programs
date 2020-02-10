package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        var bicycle1 = new Bicycle();
        var bicycle2 = new Bicycle();
        bicycle1.run(40);

        ArrayList<Bicycle> list = new ArrayList<>();
        list.add(bicycle1);
        list.add(bicycle2);


        System.out.println(list);

        /*bicycle1.printStates();

        bicycle2.run( 50);

        bicycle2.speedUp(10);
        bicycle2.changeGear(3);
        bicycle2.applyBrakes(10);
        bicycle2.changeGear(2);
        bicycle2.printStates();*/
    }
}

