package com.kodilla.exception.challenge;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
        }

        catch (ArithmeticException e)   {
            System.out.println("Warning exception!");
        }

        finally {
            System.out.println("Exception checked!");
        }
    }
}