package com.will.task11;

public abstract class PizzaFactory {
    public abstract Pizza createPizza();

    public void printRecipe() {
        Pizza pizza = createPizza();
        System.out.println("Recipe for " + pizza.getDescription() + ":");
        System.out.println("Cost: $" + pizza.getCost());
    }
}
