package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {

        List<Integer> numbersOdd = new ArrayList<Integer>();

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) {
                numbersOdd.add(numbers.get(i));
            }
        }
        return numbersOdd;
    }
}