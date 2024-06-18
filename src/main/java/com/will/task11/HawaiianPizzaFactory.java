package com.will.task11;

public class HawaiianPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        return pizza;
    }
}
