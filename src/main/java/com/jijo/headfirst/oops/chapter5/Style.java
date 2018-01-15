package com.jijo.headfirst.oops.chapter5;

public enum Style {
    A,B;

    @Override
    public String toString() {
        switch (this){
            case A: return "A";
            case B: return "B";
            default: return "Not Specified";
        }
    }
}
