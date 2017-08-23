package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class OddNumbers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Integer> numbers = new ArrayList();

        Random theGenerator = new Random();
        for(int n=0; n < 200; n++){
            numbers.add(theGenerator.nextInt(100));
        }
        OddNumbersExterminator tester = new OddNumbersExterminator();
        tester.exterminate(numbers);
    }
}
