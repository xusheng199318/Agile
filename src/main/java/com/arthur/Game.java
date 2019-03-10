package com.arthur;

public class Game {

    private int itsScore = 0;

    private int[] itsThrows = new int[21];

    private int itsCurrentThrow = 0;

    private int itsCurrenFrame = 0;

    private Boolean firstThrow = true;

    public void add(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
        itsScore += pins;
        adjustCurrentFrame();
    }

    private void adjustCurrentFrame() {
        if (firstThrow) {
            firstThrow = false;
            itsCurrenFrame++;
        } else {
            firstThrow = true;
        }
    }


    public int getScoreForFrame(int theFrame) {
        int ball = 0;
        int score = 0;
        for (int currentFrame = 0; currentFrame < theFrame; currentFrame++) {
            int firstThrow = itsThrows[ball++];
            int secondThrow = itsThrows[ball++];
            int frameScore = firstThrow + secondThrow;
            if (frameScore == 10) {
                score += frameScore + itsThrows[ball++];
            } else {
                score += frameScore;
            }
        }
        return score;
    }

    public int getScore() {
        return itsScore;
    }

    public int getCurrentFrame() {
        return itsCurrenFrame;
    }
}
