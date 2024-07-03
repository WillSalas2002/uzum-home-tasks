package com.will.tesk12;

public class Main {
    public static void main(String[] args) {
        // Создание такси
        Taxi taxi = new Taxi("John Doe");
        System.out.println(taxi);

        // Смена тарифа
        taxi.setTariff(new DiscountTariff());
        System.out.println("Fare for 10 miles: " + taxi.calculateFare(10));

        // Изменение состояния
        taxi.pressGas();
        System.out.println(taxi);
        taxi.pressGas();
        System.out.println(taxi);
        taxi.pressBrake();
        System.out.println(taxi);

        // Сохранение состояния
        TaxiMemento memento = taxi.saveState();

        // Изменение состояния и восстановление
        taxi.pressBrake();
        System.out.println(taxi);
        taxi.restoreState(memento);
        System.out.println("Restored state: " + taxi);

        // Сохранение в форматах XML и JSON
        Visitor xmlVisitor = new XmlVisitor();
        Visitor jsonVisitor = new JsonVisitor();
        xmlVisitor.visit(taxi);
        jsonVisitor.visit(taxi);
    }
}
