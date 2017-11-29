package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testMargheritaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new Margherita("bottom", "sauce", "cheese");
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testMargheritaOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new Margherita("bottom", "sauce", "cheese");
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza Margherita", description);
    }

    @Test
    public void testMargheritaAndIngredientsOrderGetCost() {
        //Given
        PizzaOrder theOrder = new Margherita("bottom", "sauce", "cheese");
        theOrder = new IngredientsPizzaDecorator(theOrder, Ingredient.HAM);
        theOrder = new IngredientsPizzaDecorator(theOrder, Ingredient.MUSHROOMS);
        theOrder = new IngredientsPizzaDecorator(theOrder, Ingredient.ONION);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testMargheritaAndIngredientsOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new Margherita("bottom", "sauce", "cheese");
        theOrder = new IngredientsPizzaDecorator(theOrder, Ingredient.HAM);
        theOrder = new IngredientsPizzaDecorator(theOrder, Ingredient.MUSHROOMS);
        theOrder = new IngredientsPizzaDecorator(theOrder, Ingredient.ONION);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza Margherita + HAM + MUSHROOMS + ONION", description);
    }

    @Test
    public void testMargheritaAndSouceAndCheeseOrderGetCost(){
        //Given
        PizzaOrder theOrder = new Margherita("bottom", "sauce", "cheese");
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new AdditionalSauceDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testMargheritaAndSouceAndCheeseOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new Margherita("bottom", "sauce", "cheese");
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new AdditionalSauceDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza Margherita + double cheese + additional sauce", description);
    }

}
