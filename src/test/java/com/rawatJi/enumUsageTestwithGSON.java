package com.rawatJi;

import com.google.gson.Gson;

public class enumUsageTestwithGSON {


    public static void main(String ...ddd)
    {

enumUsage us1=new enumUsage(1300, enumUsage.fuelType.Disel, enumUsage.engineType.four_STROKE, enumUsage.engineClass.MoreThanThousandLessThan1500cc);



        System.out.println(us1.getEnginecc());


        //GSON library is Google GSon
        //Its just like Jackson JAVA-JSON Object mapper.

        //Just like jackson, gson libraray lets user to map a JAVA object to JSON and vice versa
        //P.S.  here JSON means.. it simply converts ito STRING.. but a string of JSON..
        //we can then simply convert it to our own choice JSON object



        // String jsonString = gson.toJson(person);
        // Person p = gson.fromJson(jsonString, Person.class);


        Gson gsonObj=new Gson();

        System.out.println(gsonObj.toJson(us1).toString());



        String jsonTyped="{\"enginecc\":1600,\"fuel\":\"Disel\",\"type\":\"four_STROKE\",\"category\":\"C\"}";

        enumUsage us2=new Gson().fromJson(jsonTyped,enumUsage.class);

        us1.equals(us2);

    }
}
