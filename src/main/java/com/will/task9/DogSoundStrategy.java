package com.will.task9;

public class DogSoundStrategy implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Gav-Gav!");
    }
}
