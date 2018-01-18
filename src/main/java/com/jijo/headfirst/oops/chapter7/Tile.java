package com.jijo.headfirst.oops.chapter7;

import java.util.LinkedList;
import java.util.List;

public class Tile {
    private List<Unit> units;

    public Tile(List<Unit> units) {
        this.units = new LinkedList<Unit>();
    }

    protected void addUnit(Unit unit){
        units.add(unit);
    }

    protected void removeUnit(Unit unit){
        units.remove(unit);
    }

    protected void removeUnits(){
        this.units.clear();
    }



    public List<Unit> getUnits() {
        return units;
    }
}
