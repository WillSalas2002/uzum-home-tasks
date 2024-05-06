package com.will.task5;

import com.will.task5.model.Animal;
import com.will.task5.model.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // Получаем конструктор класса Cat с параметром int
        Constructor<Cat> constructor = Cat.class.getDeclaredConstructor(int.class);
        // Создаем объект Cat через рефлексию
        Cat cat = constructor.newInstance(3);

        // Получаем поля класса Animal
        Field feetField = Animal.class.getDeclaredField("feet");
        Field ageField = Animal.class.getDeclaredField("age");
        Field nameField = Animal.class.getDeclaredField("name");

        // Устанавливаем модификатор доступа полей на true, чтобы можно было изменять их значения
        feetField.setAccessible(true);
        ageField.setAccessible(true);
        nameField.setAccessible(true);

        // Устанавливаем нестандартные значения полей
        feetField.set(cat, 6);
        ageField.set(cat, 10);
        nameField.set(cat, "Kitty");

        // Выводим значения полей
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Feet: " + cat.getFeet());
    }
}
