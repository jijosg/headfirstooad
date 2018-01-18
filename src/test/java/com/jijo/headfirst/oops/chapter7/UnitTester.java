package com.jijo.headfirst.oops.chapter7;

import org.junit.Test;

public class UnitTester{

    public void testType(Unit unit,String type,String expectedType){
        System.out.println("\nTesting setting/getting the type property");
        unit.setType(type);
        String outputType = unit.getType();
        if(expectedType.equalsIgnoreCase(outputType)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed: "+outputType+ " didn't match "+expectedType);
        }
    }

    public void testUnitSpecificProperty(Unit unit,String propertyName, Object inputValue,
                                         Object expectedOutputValue){
        System.out.println("\nTesting setting/getting a unit-specific property");
        unit.setProperty(propertyName,inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if(expectedOutputValue.equals(outputValue)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed: "+outputValue+ " didn't match "+expectedOutputValue);
        }
    }

    public void testChangeProperty(Unit unit,String propertyName,Object inputValue,
                                   Object expectedOutputValue){
        System.out.println("\nTesting changing an existing property's value");
        unit.setProperty(propertyName,inputValue);

    }

    @Test
    public void testInfantry(){
        UnitTester tester = new UnitTester();
        Unit unit = new Unit(1000);
        tester.testType(unit,"infantry","infantry");
    }


}
