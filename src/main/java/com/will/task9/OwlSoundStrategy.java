package com.will.task9;

public class OwlSoundStrategy implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Ugh-Ugh-Ugh!");
    }
}
