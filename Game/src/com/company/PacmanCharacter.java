package com.company;

public class PacmanCharacter extends Character {
    public PacmanCharacter (Coordinate position){
        super(position);
    }
    public void printPosition() {
        System.out.format("Pac-Man at (%d, %d)\n", position.x, position.y);
    }

}

