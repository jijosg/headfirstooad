package com.jijo.headfirst.oops.chapter5;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        if(properties == null) {
            this.properties = new HashMap();
        }else{
            this.properties = new HashMap(properties);
        }

    }

    public Map getProperties() {
        return properties;
    }

    public Object getProperty(String key){
        return this.properties.get(key);
    }

    public boolean matches(InstrumentSpec spec){
        for(Object i : spec.getProperties().keySet()){
            String key= (String)i;
            if(!properties.get(key).equals(spec.getProperty(key))){
                return false;
            }
        }
        return true;
    }
}
