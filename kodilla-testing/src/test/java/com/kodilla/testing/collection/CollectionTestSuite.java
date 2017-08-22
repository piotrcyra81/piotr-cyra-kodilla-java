package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //List emptyList = new ArrayList();
        //When
        boolean result = emptyList.isEmpty();
        System.out.println("Testing " + result);
        //Then
        Assert.assertTrue(result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList (){

        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        //When
        int resultEvenOdd = numbers.get();
        System.out.println("Testing " + resultEvenOdd);
        //Then
        Assert.assertEquals("numbers",resultEvenOdd);

    }
}
