package com.will.task8;

public class App {
    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        Engine engine1 = new Engine(20);
        Engine engine2 = new Engine(22);
        Car car1 = new Car(1, engine1);
        Car car2 = new Car(2, engine2);
        factory.addCar(car1);
        factory.addCar(car2);

        Customer customer1 = new Customer("Иван Иванов");
        Customer customer2 = new Customer("Петр Петров");
        Customer customer3 = new Customer("Сидор Сидоров");
        factory.addCustomer(customer1);
        factory.addCustomer(customer2);
        factory.addCustomer(customer3);

        // Выводим информацию до продажи
        System.out.println("Информация до продажи:");
        System.out.println("Автомобили на складе:");
        for (Car car : factory.getCars()) {
            System.out.println("Серийный номер: " + car.getId() + ", размер педалей: " + car.getEngine().getPedalSize());
        }
        System.out.println("Клиенты в очереди:");
        for (Customer customer : factory.getCustomers()) {
            System.out.println("ФИО: " + customer.getName() + ", автомобиль: " + (customer.getCar() == null ? "Нет" : "Есть"));
        }

        // Продаем автомобили
        factory.saleCar();

        // Выводим информацию после продажи
        System.out.println("\nИнформация после продажи:");
        System.out.println("Автомобили на складе:");
        for (Car car : factory.getCars()) {
            System.out.println("Серийный номер: " + car.getId() + ", размер педалей: " + car.getEngine().getPedalSize());
        }
        System.out.println("Клиенты в очереди:");
        for (Customer customer : factory.getCustomers()) {
            System.out.println("ФИО: " + customer.getName() + ", автомобиль: " + (customer.getCar() == null ? "Нет" : "Есть"));
        }
    }
}
