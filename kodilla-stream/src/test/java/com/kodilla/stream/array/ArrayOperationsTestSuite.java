package com.kodilla.com.kodilla.stream.world.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int numbers[] = new int[3];

        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;

        double average  = ArrayOperations.getAverage(numbers);
        Assert.assertEquals(4, average, 0.0);
    }
}