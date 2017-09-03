package com.kodilla.testing.shape;

public class Square implements Shape {

    public String getShapeName() {
        System.out.println("This is a Square");
        return "This is a Square";
    }

    public int getField() {
        System.out.println("Square field: ");
        return 25;
    }
}