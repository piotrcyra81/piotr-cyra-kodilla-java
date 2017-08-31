package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<String> shapes = new ArrayList<String>();

    public void showFigures() {

        for(int i = 0; i < shapes.size(); i++){
            System.out.println(shapes);
        }
    }

    public void addFigure() {

        shapes.add("Circle");
        shapes.add("Square");
        shapes.add("Triangle");
    }

}