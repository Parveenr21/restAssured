package com.rawatJi;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class PATCH_restAssured {


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



		//Now say we have to send a JSON in body for PATCH


		String URI="http://{{URL}}/auth-service/v1/accounts";


//PREPARING BODY
/*

		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");
		requestParams.put("Email",  "sample2ee26d9@gmail.com");
*/


/*
Create POJO.. of request  with method GETTERs and SETTERs
and EDIT and then convert it to json String
 */

//new Gson().toJson(POJO object)


//Sample way
		Response resp=RestAssured.given().queryParams(qParam).headers(headersMap).body(new Object()).put(URI);

		int httpresponseCode=resp.getStatusCode();

		Map<String,String> map=resp.getBody().as(Map.class);
		String JsonSTRING=resp.getBody().asString();








	}



}
