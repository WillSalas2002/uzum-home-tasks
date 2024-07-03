package com.will.tesk12;

public class JsonVisitor implements Visitor {
    @Override
    public void visit(Taxi taxi) {
        String json = "{\n" +
                "  \"Driver\": \"" + taxi.getDriver() + "\",\n" +
                "  \"Mileage\": " + taxi.getMileage() + ",\n" +
                "  \"State\": \"" + taxi.getState().getClass().getSimpleName() + "\"\n" +
                "}";
        System.out.println(json);
    }
}
