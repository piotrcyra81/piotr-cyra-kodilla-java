package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<String> shapeCollector = new ArrayList<String>();

    public ShapeCollector() {

       shapeCollector.add("Circle");
       shapeCollector.add("Square");
       shapeCollector.add("Triangle");
    }

    public void showFigure() {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        circle.getShapeName();
        triangle.getShapeName();
        square.getShapeName();
    }

    public void showField() {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        circle.getField();
        triangle.getField();
        square.getField();
    }

}