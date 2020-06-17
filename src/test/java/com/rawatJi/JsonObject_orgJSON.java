package com.rawatJi;

import org.json.JSONObject;

public class JsonObject_orgJSON {


    public static void main(String ...dddd)
    {


        //Using org JSON lib;s JSON object

        JSONObject jsonSample =new JSONObject();

        jsonSample.put("grant_type", "password");
        jsonSample.put("username", "pindar1@gmail.com");
        jsonSample.put("password", "Ubuntu@12");



        System.out.println(jsonSample.toString());

    }
}
