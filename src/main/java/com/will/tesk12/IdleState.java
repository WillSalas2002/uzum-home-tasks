package com.will.tesk12;

public class IdleState implements TaxiState {
    @Override
    public void pressGas(Taxi taxi) {
        taxi.setState(new DrivingState());
        System.out.println("Taxi started driving.");
    }

    @Override
    public void pressBrake(Taxi taxi) {
        System.out.println("Taxi is already idle.");
    }

}
