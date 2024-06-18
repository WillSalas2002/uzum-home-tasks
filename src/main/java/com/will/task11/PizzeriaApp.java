package com.will.task11;

public class PizzeriaApp {
    public static void main(String[] args) {
        // Пример использования паттерна Декоратор для создания пиццы по индивидуальному заказу
        Pizza customPizza = new BasicPizza();
        customPizza = new CheeseDecorator(customPizza);
        customPizza = new PepperoniDecorator(customPizza);
        customPizza = new PineappleDecorator(customPizza);
        System.out.println("Custom Pizza: " + customPizza.getDescription());
        System.out.println("Cost: $" + customPizza.getCost());

        // Пример использования паттерна Фабричный метод для создания пиццы по рецепту
        PizzaFactory factory = new FourCheesePizzaFactory();
        factory.printRecipe();

        PizzaFactory hawaiianFactory = new HawaiianPizzaFactory();
        hawaiianFactory.printRecipe();

        // Пример использования паттерна Builder для выбора теста
        PizzaWithDough pizzaWithThinDough = new PizzaWithDough.Builder("Basic Pizza with Cheese", 6.5)
                .withThinDough()
                .build();
        System.out.println("Pizza with Dough: " + pizzaWithThinDough.getDescription());
        System.out.println("Cost: $" + pizzaWithThinDough.getCost());

        PizzaWithDough pizzaWithThickDough = new PizzaWithDough.Builder("Basic Pizza with Cheese", 6.5)
                .withThickDough()
                .build();
        System.out.println("Pizza with Dough: " + pizzaWithThickDough.getDescription());
        System.out.println("Cost: $" + pizzaWithThickDough.getCost());
    }
}
