package com.will.task9;

public class Animal {
    private final String name;
    private final SoundStrategy soundStrategy;

    public Animal(String name, SoundStrategy soundStrategy) {
        this.name = name;
        this.soundStrategy = soundStrategy;
    }

    public void makeSound() {
        soundStrategy.makeSound();
    }

    public String getName() {
        return name;
    }
}
