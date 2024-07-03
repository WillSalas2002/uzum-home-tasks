package com.will.tesk12;

public class TaxiMemento {
    private final double mileage;
    private final String driver;
    private final TaxiState state;

    public TaxiMemento(double mileage, String driver, TaxiState state) {
        this.mileage = mileage;
        this.driver = driver;
        this.state = state;
    }

    public double getMileage() {
        return mileage;
    }

    public String getDriver() {
        return driver;
    }

    public TaxiState getState() {
        return state;
    }
}
