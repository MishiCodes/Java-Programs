package com.company;

public class Main {

    public static void main(String[] args) {
	    var bicycle1 = new Bicycle();
	    var bicycle2 = new Bicycle();

	    bicycle1.changeCadence(40);
	    bicycle1.speedUp(10);
        bicycle1.changeGear(2);
        bicycle1.printStates();

        bicycle2.changeCadence(50);
        bicycle2.speedUp(10);
        bicycle2.changeGear(2);
        bicycle2.speedUp(10);
        bicycle2.changeGear(3);
        bicycle2.applyBrakes(10);
        bicycle2.changeGear(2);
        bicycle2.printStates();

    }
}
