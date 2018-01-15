package com.jijo.headfirst.oops.chapter5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder",Builder.COLLINGS);
        properties.put("backWood",Wood.SITKA);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List matchingGuitars = inventory.search(clientSpec);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Object i : matchingGuitars) {
                Instrument instrument = (Instrument)i;
                InstrumentSpec invSpec = instrument.getSpec();
                System.out.println("  We have a " +
                        invSpec.getProperty("instrumentType") + " with the following properties");
                for(Object j : invSpec.getProperties().keySet()) {
                    String propertyName = (String) j;
                    if (propertyName.equals("instrumentType")) {
                        continue;
                    }
                    System.out.println("   " + propertyName + ": " + invSpec.getProperty(propertyName));
                }
                System.out.println("   You can have this "+invSpec.getProperty("instrumentType")+ " for $"+instrument.getPrice() +"\n---");
            }
        }else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Map properties=  new HashMap();
        properties.put("instrumentType",InstrumentType.GUITAR);
        properties.put("builder",Builder.COLLINGS);
        properties.put("model","CJ");
        properties.put("type",Type.ACOUSTIC);
        properties.put("numStrings",6);
        properties.put("topWood",Wood.INDIAN_ROSEWOOD);
        properties.put("backWood",Wood.SITKA);
        inventory.addInstrument("11277", 3999.95,new InstrumentSpec(properties));

        properties.put("builder",Builder.FENDER);
        properties.put("model","Stratocastor");
        properties.put("type",Type.ELECTRIC);
        properties.put("numStrings",6);
        properties.put("topWood",Wood.ALDER);
        properties.put("backWood",Wood.ALDER);
        inventory.addInstrument("V95693", 1499.95,new InstrumentSpec(properties));

        properties.put("builder",Builder.MARTIN);
        properties.put("model","D-18");
        properties.put("type",Type.ACOUSTIC);
        properties.put("numStrings",4);
        properties.put("topWood",Wood.MAHOGANY);
        properties.put("backWood",Wood.ADIRONDACK);
        inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

        properties.put("builder",Builder.MARTIN);
        properties.put("model","OM-28");
        properties.put("type",Type.ACOUSTIC);
        properties.put("numStrings",4);
        properties.put("topWood",Wood.BRAZILIAN_ROSEWOOD);
        properties.put("backWood",Wood.ADIRONDACK);
        inventory.addInstrument("76531", 6295.95,new InstrumentSpec(properties));
        properties.put("builder",Builder.GIBSON);
        properties.put("model","Les Paul");
        properties.put("type",Type.ELECTRIC);
        properties.put("numStrings",4);
        properties.put("topWood",Wood.MAHOGANY);
        properties.put("backWood",Wood.MAHOGANY);
        inventory.addInstrument("70108276", 2295.95,new InstrumentSpec(properties));
        /*inventory.addGuitar("82765501", 1890.95,"4", Builder.GIBSON,
                "SG '61 Reissue", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAHOGANY);
        inventory.addGuitar("77023", 6275.95,"4", Builder.MARTIN,
                "D-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
        inventory.addGuitar("1092", 12995.95,"4", Builder.OLSON,
                "SJ", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.CEDAR);
        inventory.addGuitar("566-62", 8999.95,"4", Builder.RYAN,
                "Cathedral", Type.ACOUSTIC,
                Wood.COCOBOLO, Wood.CEDAR);
        inventory.addGuitar("6 29584", 2100.95, "4",Builder.PRS,
                "Dave Navarro Signature", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAPLE);*/
    }
}