package com.will.tesk12;

public class DiscountTariff implements TariffStrategy{
    private final double FEE_PER_MILE = 0.8;
    @Override
    public double calculateFare(double distance) {
        return distance * FEE_PER_MILE;
    }
}
