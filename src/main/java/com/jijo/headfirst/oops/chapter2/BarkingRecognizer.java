package com.jijo.headfirst.oops.chapter2;

import java.util.List;

public class BarkingRecognizer {
    private DogDoor door;
    public BarkingRecognizer(DogDoor door){

        this.door = door;
    }

    public void recognize(Bark bark){

        System.out.println("    BarkRecognizer: Heard a "+bark.getSound());
        List<Bark> allowedBarks = door.getAllowedBarks();
        for(Bark allowedBark : allowedBarks) {
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
        System.out.println("This dog is not allowed");
    }

}
