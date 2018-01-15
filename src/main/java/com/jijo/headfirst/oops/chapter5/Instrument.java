package com.jijo.headfirst.oops.chapter5;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentType instrumentType;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
