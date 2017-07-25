package com.kodilla;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAddAToB = calculator.addAToB(5, 5);
        int resultSubstractAFromB = calculator.substractAFromB(5, 5);

        System.out.println("Result add A to B = " + resultAddAToB);
        System.out.println("Result substract A from B = " + resultSubstractAFromB);
    }
}