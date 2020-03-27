package com.company;

import java.util.ArrayList;

public class Game {

    private static ArrayList<Character> characters;
    public static void printState() {
        for (Character c : characters) {
            c.printPosition();
        }
    }
    public static void main(String[] args) {
        System.out.println("Starting game");
        Character pacman = new PacmanCharacter(new Coordinate(0, 0));
        Character blinky = new GhostCharacter(new Coordinate(5, 5), "Blinky");

        characters = new ArrayList<Character>();
        characters.add(pacman);
        characters.add(blinky);
        printState();
    }
}
