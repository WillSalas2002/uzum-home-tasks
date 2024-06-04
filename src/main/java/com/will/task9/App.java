package com.will.task9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", new LionSoundStrategy()));
        animals.add(new Animal("Owl", new OwlSoundStrategy()));
        animals.add(new Animal("Dog", new DogSoundStrategy()));
        animals.add(new Animal("Cat", new CatSoundStrategy()));

        for (Animal animal : animals) {
            System.out.printf("%s goes: ", animal.getName());
            animal.makeSound();
        }
    }
}
