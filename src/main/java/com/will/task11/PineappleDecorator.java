package com.will.task11;

public class PineappleDecorator extends PizzaDecorator {
    public PineappleDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}
