package com.kodilla.testing.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        long sum = 0;

        for (int n=0; n < 1000; n++) {
            sum+= n;
            System.out.println("(" + n + ") sum equals: " + sum);

        }
        assertEquals(499500, sum);
    }
}