package com.rawatJi;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class Post_restAssured {

	
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



		//Now say we have to send a JSON in body

	/*

	First way

	 static String payload = "{\n" +
        "  \"description\": \"Some Description\",\n" +
        "  \"id\": \"Some id\",\n" +
        "  \"name\": \"Some name\"\n" +
        "}";

    public static Response postJsonPayload() {

        return
            given()
            .contentType(ContentType.JSON)
            .body(payload)
            .post("/some/resource")
            .then()
            .statusCode(200)
            .extract()
            .response();
    }




	Second way


	Using JSON simple Object..

	JSONObject requestParams = new JSONObject();
 requestParams.put("FirstName", "Virender"); // Cast
 requestParams.put("LastName", "Singh");
 requestParams.put("UserName", "sdimpleuser2dd2011");
 requestParams.put("Password", "password1");
 requestParams.put("Email",  "sample2ee26d9@gmail.com");

 request.body(requestParams.toJSONString());


	 */









}
	
	
	
}
