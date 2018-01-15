package com.jijo.headfirst.oops.chapter1;

public class GuitarSpec {
    private Builder builder;
    private String model,numStrings;
    private Type type;
    private Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model,String numStrings, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.numStrings = numStrings;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getNumStrings() {
        return numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec guitarSpec) {
        if(this.builder!=guitarSpec.getBuilder()){
            return false;
        }
        if(this.model!=guitarSpec.getModel()){
            return false;
        }
        if(this.type!=guitarSpec.getType()){
            return false;
        }
        if(this.backWood!=guitarSpec.getBackWood()){
            return false;
        }
        if(this.topWood!=guitarSpec.getTopWood()){
            return false;
        }
        if(this.numStrings!=guitarSpec.getNumStrings()){
            return false;
        }
        return true;
    }
}
