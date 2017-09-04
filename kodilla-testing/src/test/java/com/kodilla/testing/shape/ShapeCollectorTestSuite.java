package com.kodilla.testing.shape;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ShapeCollectorTestSuite {

    @Test
    public void testShapeAdd() {

        ShapeCollector shapeList = new ShapeCollector();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        shapeList.addFigure(circle);
        shapeList.addFigure(square);
        shapeList.addFigure(triangle);

        assertEquals(3, shapeList.shapes.size());
    }

    @Test
    public void testShapeRemove() {

        ShapeCollector shapeList = new ShapeCollector();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        shapeList.addFigure(circle);
        shapeList.addFigure(square);
        shapeList.addFigure(triangle);

        shapeList.removeFigure(circle);
        assertEquals(2, shapeList.shapes.size());
    }

    @Test
    public void testShapeGet() {

        ShapeCollector shapeList = new ShapeCollector();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        shapeList.addFigure(circle);
        shapeList.addFigure(square);
        shapeList.addFigure(triangle);

        Shape result  = shapeList.getFigure(2);
        assertEquals(triangle, result);
    }
}