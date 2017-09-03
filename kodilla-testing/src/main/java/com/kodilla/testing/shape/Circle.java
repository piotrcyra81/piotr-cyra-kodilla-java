package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName() {
        System.out.println("This is a Circle");
        return "This is a Circle";
    }

    public int getField() {
        System.out.println("Circle field: ");
        return 5;
    }
}
