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

    public addFigure(Shape shape) {

        shapes.add("Circle");
        shapes.add("Square");
        shapes.add("Triangle");

        return(shapes);
    }

    public removeFigure(Shape shape) {

        shapes.remove("Circle");
        shapes.remove("Square");
        shapes.remove("Triangle");

        return(shapes);
    }

    public getFigure(int n) {

        for(n=0;n<=shapes.size();n++) {
            shapes.get(n);
        }
        return(shapes);
    }

}