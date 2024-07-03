package com.will.tesk12;

public class RacingState implements TaxiState {
    @Override
    public void pressGas(Taxi taxi) {
        System.out.println("Taxi is already racing.");
    }

    @Override
    public void pressBrake(Taxi taxi) {
        taxi.setState(new DrivingState());
        System.out.println("Taxi slowed down to driving.");
    }
}
