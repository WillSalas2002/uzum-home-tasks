package com.will.task5.model;

public class Cat extends Animal {
    public Cat(int age) {
        super("Cat",age);
    }

    @Override
    public void doVoice() {
        System.out.println("meow");
    }
}
