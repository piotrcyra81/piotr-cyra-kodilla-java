package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        int resultAddAToB = calculator.addAToB(5, 5);
        int resultSubstractAFromB = calculator.substractAFromB(5, 5);

        System.out.println("Result add A to B = " + resultAddAToB);
        System.out.println("Result substract A from B = " + resultSubstractAFromB);

        if (resultAddAToB==10){
            System.out.println("test resultAddAToB OK");
        } else {
            System.out.println("resultAddAToB Error!");
        }

        if (resultSubstractAFromB==0){
            System.out.println("test resultSubstractAFromB OK");
        } else {
            System.out.println("resultSubstractAFromB Error!");
        }
    }
}