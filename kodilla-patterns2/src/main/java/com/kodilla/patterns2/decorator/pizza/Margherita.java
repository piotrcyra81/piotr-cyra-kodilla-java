package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Margherita implements PizzaOrder {

    private String bottom;
    private String tomatoSauce;
    private String cheese;

    public Margherita(String bottom, String tomatoSauce, String cheese) {
        this.bottom = bottom;
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza Margherita";
    }
}
