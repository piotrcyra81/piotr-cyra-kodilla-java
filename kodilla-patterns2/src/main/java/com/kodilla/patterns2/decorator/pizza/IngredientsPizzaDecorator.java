package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngredientsPizzaDecorator extends AbstractPizzaOrderDecorator {

    private Ingredient ingredient;

    public IngredientsPizzaDecorator(PizzaOrder pizzaOrder, Ingredient ingredient) {
        super(pizzaOrder);
        this.ingredient = ingredient;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " + ingredient.name();
    }
}
