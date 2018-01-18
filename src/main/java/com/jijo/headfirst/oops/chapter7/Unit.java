package com.jijo.headfirst.oops.chapter7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {

    private int id;
    private String type,name;
    private Map properties;
    private List<Weapon> weapons;

    public Unit(int id) {
        this.id = id;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWeapon(Weapon weapon) {

        if(this.weapons == null){
            this.weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public Object getProperty(String property) {
        if(this.properties==null){
            return null;
        }
        return properties.get(property);
    }

    public void setProperty(String key,Object value) {
        if(properties==null){
            properties = new HashMap();
        }
        properties.put(key,value);
    }
}
