package com.company;

public class MediaPlayer {
    public void launchPlayer(Player p) {
        p.play();
    }


    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer();
        mp.launchPlayer(new Player());
        mp.launchPlayer(new RealPlayer());
        mp.launchPlayer(new VLCPlayer());

    }
}
