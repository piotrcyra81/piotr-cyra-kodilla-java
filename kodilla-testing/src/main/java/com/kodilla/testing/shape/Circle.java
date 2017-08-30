package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName() {
        System.out.println("This is a Circle");
        return "This is a Circle";
    }

    public String getField() {
        System.out.println("Circle field");
        return "Circle field";
    }
}
