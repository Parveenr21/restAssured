package com.rawatJi;

import java.awt.*;
import java.util.Objects;

public class enumUsage {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        enumUsage enumUsage = (enumUsage) o;
        return enginecc == enumUsage.enginecc &&
                Objects.equals(fuel, enumUsage.fuel) &&
                Objects.equals(type, enumUsage.type) &&
                Objects.equals(category, enumUsage.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enginecc, fuel, type, category);        //Plain enum.. no Getter ..no Setter
    }
/*
   The below 3 enums do not belong to this class.. these are not variables..
    These are like classes and not related to this class like variables
    To hold the value of variables ...create separate variables

 */




     enum fuelType {Petrol,Disel,CNG};      //enum constants ..

     enum engineType {four_STROKE,two_STROKE};

     enum engineClass {LessThanThousandCC("A"),MoreThanThousandLessThan1500cc("B"),MOREThan1500CC("C");
        String type;

        engineClass(String type)            //enum constructor to SET..Its implcit calling as constructor
        {this.type=type; }

        public String getType() { return type; } //Getter to GET

    }


    private int enginecc;
    private String fuel;
    private String type;
    private String category;

    public enumUsage(int enginecc, fuelType fuel, engineType stroke,engineClass eclass) {
        this.enginecc = enginecc;


        this.fuel=fuel.toString();
        this.type=stroke.toString();
        this.category=eclass.getType(); //here using gettter of enum


    }

    public int getEnginecc() {
        return enginecc;
    }





}
