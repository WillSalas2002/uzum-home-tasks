package com.will.tesk12;

public class StandardTariff implements TariffStrategy {
    private final double FEE_PER_MILE = 1.0;
    @Override
    public double calculateFare(double distance) {
        return distance * FEE_PER_MILE;
    }
}
