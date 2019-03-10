package com.arthur;

public class Frame {
    private int itsScore = 0;

    public void add(int pins) {
        itsScore += pins;
    }

    public int getScore() {
        return itsScore;
    }
}
