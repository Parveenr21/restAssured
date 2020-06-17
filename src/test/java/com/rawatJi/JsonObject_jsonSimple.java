package com.rawatJi;


import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;

public class JsonObject_jsonSimple {


    public static void main(String ...dddd)
    {


        //Using json Simple lib;s JSON object

        JSONObject jsonSample =new JSONObject();

        jsonSample.put("grant_type", "password");
        jsonSample.put("username", "pindar1@gmail.com");
        jsonSample.put("password", "Ubuntu@12");



        System.out.println(jsonSample.toString());

        System.out.println(jsonSample.toJSONString());

        //This has advantage over org json.

        //It has these additional useful methods


        /*
        jsonSample.containsKey()  //boolean
        jsonSample.containsValue() //boolean
        jsonSample.putAll(map);  //adding map


         */




    }
}
