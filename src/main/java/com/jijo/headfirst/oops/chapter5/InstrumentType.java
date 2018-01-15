package com.jijo.headfirst.oops.chapter5;

public enum InstrumentType {
    GUITAR,BANJO,MANDOLIN,DOBRO,FIDDLE,BASS;

    @Override
    public String toString() {
        switch (this){
            case GUITAR: return "Guitar";
            case BANJO: return "Banjo";
            case MANDOLIN: return "Mandolin";
            case DOBRO: return "Dobro";
            case FIDDLE: return "Fiddle";
            case BASS: return "Bass";
            default: return "No such instrument";
        }
    }
}
