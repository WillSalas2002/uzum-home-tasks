package com.will.task8;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FactoryAF {
    private List<Car> cars;
    private List<Customer> customers;

    public void addCar(Car car) {
        if (cars == null) {
            cars = new ArrayList<>();
        }
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        if (customers == null) {
            customers = new ArrayList<>();
        }
        customers.add(customer);
    }

    public void saleCar() {
        for (Customer customer : customers) {
            if (!cars.isEmpty()) {
                Car car = cars.remove(0);
                customer.setCar(car);
                System.out.println(customer.getName() + " получил автомобиль с номером " + car.getId());
            } else {
                System.out.println("Нет доступных автомобилей на складе.");
                break;
            }
        }

        if (cars.isEmpty()) {
            System.out.println("Все автомобили распроданы.");
        }
    }
}
