package com.company;

class GhostCharacter extends Character {
    private String name;
    private boolean eatable;

    public GhostCharacter(Coordinate position, String name) {
        super(position);
        this.name = name;
        eatable = false;
    }

    public void setEatable(Boolean value) {
        eatable = value;
    }

    public Boolean isEatable() {
        return eatable;
    }

    public void printPosition() {
        System.out.format("%s at (%d, %d)\n", name, position.x, position.y);
    }


}
