package com.will.task11;

public class FourCheesePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        return pizza;
    }
}
