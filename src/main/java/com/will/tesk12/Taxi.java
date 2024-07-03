package com.will.tesk12;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Taxi {
    private double mileage;
    private String driver;
    private TariffStrategy tariff;
    private TaxiState state;

    public Taxi(String driver) {
        this.driver = driver;
        this.state = new IdleState();
        this.tariff = new StandardTariff();
    }

    public void pressGas() {
        state.pressGas(this);
    }

    public void pressBrake() {
        state.pressBrake(this);
    }

    public double calculateFare(double distance) {
        return tariff.calculateFare(distance);
    }

    public TaxiMemento saveState() {
        return new TaxiMemento(mileage, driver, state);
    }

    public void restoreState(TaxiMemento memento) {
        this.mileage = memento.getMileage();
        this.driver = memento.getDriver();
        this.state = memento.getState();
    }

    public String toString() {
        return "Taxi{driver='" + driver + "', mileage=" + mileage + ", state=" + state.getClass().getSimpleName() + "}";
    }
}
