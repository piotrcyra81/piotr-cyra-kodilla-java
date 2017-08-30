package com.kodilla.testing.shape;
import org.junit.Test;


public class ShapeCollectorTestSuite {

    @Test
    public void testShowName() {
        //Given
        ShapeCollector names = new ShapeCollector();
        //When
        names.showFigure();
        //Then
        //do nothing
    }

    @Test
    public void testShowField() {
        //Given
        ShapeCollector fields = new ShapeCollector();
        //When
        fields.showField();
        //Then
        //do nothing
    }

}
