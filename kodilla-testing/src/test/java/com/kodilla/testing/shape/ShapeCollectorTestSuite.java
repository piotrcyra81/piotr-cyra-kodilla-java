package com.kodilla.testing.shape;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    @Test
    public void testShapeAdd() {

        ShapeCollector shapeList = new ShapeCollector();

        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shapeList.addFigure(circle);
        shapeList.addFigure(square);
        shapeList.addFigure(triangle);

        assertEquals(3, shapeList.shapes.size());
    }

    @Test
    public void testShapeRemove() {

        ShapeCollector shapeList = new ShapeCollector();

        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shapeList.addFigure(circle);
        shapeList.addFigure(square);
        shapeList.addFigure(triangle);

        shapeList.removeFigure(circle);
        assertEquals(2, shapeList.shapes.size());
    }
}