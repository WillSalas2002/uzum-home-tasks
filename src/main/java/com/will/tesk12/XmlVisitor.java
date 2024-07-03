package com.will.tesk12;

public class XmlVisitor implements Visitor {
    @Override
    public void visit(Taxi taxi) {
        String xml = "<Taxi>\n" +
                "  <Driver>" + taxi.getDriver() + "</Driver>\n" +
                "  <Mileage>" + taxi.getMileage() + "</Mileage>\n" +
                "  <State>" + taxi.getState().getClass().getSimpleName() + "</State>\n" +
                "</Taxi>";
        System.out.println(xml);
    }
}
