package com.arthur;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFrame {
    private Game g;

    @Before
    public void init() {
        g = new Game();
    }

    @Test
    public void testAddOneThrow() {
        Frame f = new Frame();
        f.add(5);
        assertEquals(5, f.getScore());
    }

    @Test
    public void testFourThrowsNoMark() {
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        assertEquals(18, g.getScore());
        assertEquals(9, g.getScoreForFrame(1));
        assertEquals(18, g.getScoreForFrame(2));
    }

    @Test
    public void testSimpleSpare() {
        g.add(3);
        g.add(7);
        g.add(3);
        assertEquals(13, g.getScoreForFrame(1));
        assertEquals(2, g.getCurrentFrame());
    }
}
