package com.will.task9;

public class CatSoundStrategy implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Meow-Meow");
    }
}
