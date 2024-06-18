package com.will.task11;

public class PizzaWithDough {
    private String dough;
    private String description;
    private double cost;

    private PizzaWithDough(Builder builder) {
        this.dough = builder.dough;
        this.description = builder.description;
        this.cost = builder.cost;
    }

    public String getDescription() {
        return description + " with " + dough + " dough";
    }

    public double getCost() {
        return cost;
    }

    public static class Builder {
        private String dough;
        private final String description;
        private final double cost;

        public Builder(String description, double cost) {
            this.description = description;
            this.cost = cost;
        }

        public Builder withThinDough() {
            this.dough = "Thin";
            return this;
        }

        public Builder withThickDough() {
            this.dough = "Thick";
            return this;
        }

        public PizzaWithDough build() {
            return new PizzaWithDough(this);
        }
    }
}
