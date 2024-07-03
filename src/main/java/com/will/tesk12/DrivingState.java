package com.will.tesk12;

public class DrivingState implements TaxiState {
    @Override
    public void pressGas(Taxi taxi) {
        taxi.setState(new RacingState());
        System.out.println("Taxi is racing.");
    }

    @Override
    public void pressBrake(Taxi taxi) {
        taxi.setState(new IdleState());
        System.out.println("Taxi stopped.");
    }

}
