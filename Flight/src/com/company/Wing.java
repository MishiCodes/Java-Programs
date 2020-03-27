package com.company;

public class Wing {
    private int length;
    private int thrush;
    private boolean enginePower;
    private final int MAX_THRUSH = 250;

    public  Wing(int length) {
        this.length = length;
        thrush = 0;
        enginePower = false;
    }

    public boolean increaseThrush() {
        if (thrush + 10 < MAX_THRUSH) {
            thrush += 10;
            }
        return false;
    }

    public void powerOnEngines() {
        enginePower = true;
    }

}
