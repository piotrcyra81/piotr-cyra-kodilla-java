package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<String> shapes = new ArrayList<String>();

    public ShapeCollector(List<String> shapes) {
        this.shapes = shapes;
    }

    public List<String> getShapes() {
        return shapes;
    }

    public void showFigures() {

        for(int i = 0; i < shapes.size(); i++){
            System.out.println(shapes);
        }
    }

    public ShapeCollector(Shape shape) {

        shapes.add("Circle");
        shapes.add("Square");
        shapes.add("Triangle");

        return shape;
    }

    public removeFigure(Shape shape) {

        shapes.remove("Circle");
        shapes.remove("Square");
        shapes.remove("Triangle");

        System.out.println("Size list: "+shapes.size());

        return shape;
    }

    public getFigure(int n) {

        for(n=0;n<=shapes.size();n++) {
            shapes.get(n);
        }
        return(shapes);
    }

}