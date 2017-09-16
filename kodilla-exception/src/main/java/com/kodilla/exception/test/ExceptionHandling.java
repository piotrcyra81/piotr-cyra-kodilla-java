package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(4, 8.5);
        }
        catch (Exception e) {
            System.out.println("Warning exception!");
        } finally {
            System.out.println("Exception checked!");
        }
    }
}
