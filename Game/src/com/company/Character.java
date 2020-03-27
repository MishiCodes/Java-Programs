package com.company;

class Character {

    protected Coordinate position;

    public Character(Coordinate position) {
        this.position = position;
    }
    public void moveUp() {
        position.y++;
    }
    public void moveRight() {
        position.x++;
    }
    public void moveDown() {
        position.y--;
    }
    public void moveLeft() {
        position.x--;
    }
    public void printPosition () {
        System.out.format("Character at (%d, %d)\n", position.x, position.y);
    }
}

