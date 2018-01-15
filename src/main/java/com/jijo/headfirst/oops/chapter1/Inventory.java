package com.jijo.headfirst.oops.chapter1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        this.guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator();i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> searchGuitar(GuitarSpec searchSpec){
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for(Iterator i = this.guitars.iterator();i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if(guitarSpec.matches(searchSpec)){
                matchingGuitars.add(guitar);
            }

        }
        return matchingGuitars;
    }
}
