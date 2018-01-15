package com.jijo.headfirst.oops.chapter2;

public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public boolean equals(Object bark) {
        if (bark instanceof Bark){
            Bark otherBark = (Bark) bark;
            if(this.sound.equalsIgnoreCase(otherBark.sound)){
                return true;
            }
        }
        return false;
    }

}
