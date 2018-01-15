package com.jijo.headfirst.oops.chapter1;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price,GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.guitarSpec = spec;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
