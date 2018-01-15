package com.jijo.headfirst.oops.chapter5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        this.inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber,price,spec);
        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber){
        for(Instrument instrument: inventory){
            if(instrument.getSerialNumber().equalsIgnoreCase(serialNumber)){
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec){
        List<Instrument> matchingInstruments= new LinkedList();
        for(Instrument instrument:inventory){
            if(instrument.getSpec().matches(searchSpec)){
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
