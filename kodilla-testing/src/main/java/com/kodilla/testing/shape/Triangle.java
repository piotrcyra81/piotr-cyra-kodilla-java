package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String getShapeName() {
        System.out.println("This is a Triangle");
        return "This is a Triangle";
    }

    public String getField() {
        System.out.println("Triangle field");
        return "Triangle field";
    }
}

