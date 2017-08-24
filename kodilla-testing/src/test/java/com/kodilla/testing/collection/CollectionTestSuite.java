package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class CollectionTestSuite {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @Before
    public void start() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Start test");
    }

    @After
    public void finish() {
        System.out.println("End test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Empty list - test");
        ArrayList<Integer> rusultList = exterminator.exterminate(numbers);
        Assert.assertTrue(rusultList.size() > 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Odd numbers list - test");
        ArrayList<Integer> rusultList = exterminator.exterminate(numbers);
        for (int n = 0; n < rusultList.size(); n++) {
            Assert.assertTrue(rusultList.get(n) % 2 == 0);
        }
    }
}