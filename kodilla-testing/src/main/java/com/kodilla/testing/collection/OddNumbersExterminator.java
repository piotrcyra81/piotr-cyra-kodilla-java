package com.kodilla.testing.collection;

import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbersOdd){

        for (int n=0; n < numbersOdd.size(); n++){
            int temporaryValue = 0;
            temporaryValue = numbersOdd.get(n);

            if (temporaryValue % 2 == 0){
                System.out.println(temporaryValue);
            }
        }
        return numbersOdd;
    }
}