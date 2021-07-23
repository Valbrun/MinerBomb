package com.wv.minerbomb;

import java.util.UUID;

public class Player {
    private String fname;
    private String lname;
    private int score;
    private UUID playerID;

    public Player() {
        this.playerID = UUID.randomUUID();
        this.score = 0;
    }

    public Player(String fname ) {
        this.fname = fname;
        this.playerID = UUID.randomUUID();
        this.score = 0;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String makeFullName(){
        return fname;
    }
}
