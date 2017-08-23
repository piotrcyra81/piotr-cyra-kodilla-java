package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){

        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();

        //When
        List<Integer> rusultList = emptyList.exterminate(numbers);
        System.out.println("Testing " + rusultList);

        //Then
        Assert.assertTrue(numbers.size, 1);
    }

}
