package com.rawatJi;

import java.awt.*;

public class EngineType {


    private enum fuelType {Petrol, Disel, CNG}

    ;      //enum constants

    private enum engineType {four_STROKE, two_STROKE}

    ;

    private enum engineClass {
        LessThanThousandCC("A"), MoreThanThousandLessThan1500cc("B"), MOREThan1500CC("C");


        String type;

        engineClass(String type)            //enum constructor
        {
            this.type = type;

        }

        public String getType() {
            return type;
        }


    }


    private int enginecc;
    private String fuel;
    private String type;
    private String category;

    public EngineType(int enginecc, fuelType fuel, engineType stroke, engineClass eclass) {
        this.enginecc = enginecc;


        this.fuel = fuel.toString();
        this.type = stroke.toString();
        this.category = eclass.getType(); //here using gettter of enum


    }

    public int getEnginecc() {
        return enginecc;
    }
}