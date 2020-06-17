package com.rawatJi;


public class Car {

    private String regNo;
    private int mnfYear;

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    private int wheelsCount;
    private EngineType engine;

    public Car(String regNo,int mnfYear,int wheelsCount,EngineType engine) {
        this.regNo = regNo;
        this.mnfYear=mnfYear;
        this.wheelsCount=wheelsCount;
        this.engine=engine;
    }
}
