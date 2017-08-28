package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

   List<Integer> numbers = new ArrayList<Integer>();
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
        List<Integer> resultList = exterminator.exterminate(numbers);
        Assert.assertTrue(resultList.size() > 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Odd numbers list - test");
        List<Integer> resultList  = exterminator.exterminate(numbers);
        List<Integer> expectedList = new ArrayList<Integer>();
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) {
                expectedList.add(numbers.get(i));
                Assert.assertEquals (resultList,expectedList);
            }
        }
    }
}