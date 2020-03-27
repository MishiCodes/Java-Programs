package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Windbus737> windbuses = new ArrayList<Windbus737>();
        windbuses.add(new Windbus737());
        ArrayList<Plane> planes = new ArrayList<Plane>(windbuses);
        planes.add(new Plane());

        for (Plane plane : planes) {
            plane.fly();
        }

        System.out.println(planes);

    }
}
