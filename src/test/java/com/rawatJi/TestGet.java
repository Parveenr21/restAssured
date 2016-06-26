package com.rawatJi;

import org.junit.Test;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import java.util.Map;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.matcher.RestAssuredMatchers.*;

import org.hamcrest.Matchers.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestGet {

	
	@Test
public void testGET1() throws JSONException
{
		
		Map<String, String> qParam = new TreeMap<String, String>();
		Map<String, String> headersMap = new TreeMap<String, String>();

		Map<String, String> respMap = new TreeMap<String, String>();
		
		qParam.put("grant_type", "password");
		qParam.put("username", "pindar1@gmail.com");
		qParam.put("password", "Ubuntu@12");
		
		
		headersMap.put("Authorization", "Basic  YTRmN2U4OTMtYjk3My00NDg2LTgzY2EtY2M5Nzg0YjZiZWU2OmF5bTA3Z1FFc0duMlJVYmxYY2RNWlpmcUZuRzVhZkVP");
		headersMap.put("Accept", "application/json");
		headersMap.put("Content-Type", "application/x-www-form-urlencoded");
		
		Response resp=RestAssured.given().queryParameters(qParam).and().headers(headersMap)
		.post("http://ggeltestect010.karmalab.net:8180/auth-service/v1/tokens/password");



		/*
		Response resp=RestAssured.given().contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE).and().headers(headersMap).and().
				headers("Accept","application/json").and().queryParameters(qParam).when().
				post("http://ggeltestect010.karmalab.net:8180/auth-service/v1/tokens");

		*/
		
/*		header("Content-Type","application/x-www-form-urlencoded")
		
		contentType(ContentType.URLENC)
		contentType("application/x-www-form-urlencoded")
		
		
	Response resp= given().contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE).and()
				.header("Authorization", "Basic  YTRmN2U4OTMtYjk3My00NDg2LTgzY2EtY2M5Nzg0YjZiZWU2OmF5bTA3Z1FFc0duMlJVYmxYY2RNWlpmcUZuRzVhZkVP")
				.and().queryParameters(qParam)
				.when()
				.post("http://ggeltestect010.karmalab.net:8180/auth-service/v1/tokens");
*/


		
		//For String response
		respMap=resp.getBody().as(Map.class); 
		System.out.println(respMap);

		JSONObject respJson = new JSONObject(respMap);
		//System.out.println(respJson.toString());

		

		
}
	
	
	
}
