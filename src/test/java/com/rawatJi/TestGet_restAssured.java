package com.rawatJi;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;


import java.util.Map;
import java.util.TreeMap;

import com.google.gson.Gson;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestGet_restAssured {

	
	@Test
public void testGET1() throws JSONException
{

		Map<String, String> qParam = new TreeMap<String, String>();
		Map<String, String> headersMap = new TreeMap<String, String>();

		Map<String, String> respMap = new TreeMap<String, String>();
		
		qParam.put("grant_type", "password");
		qParam.put("username", "pindar1@gmail.com");
		qParam.put("password", "Ubuntu@12");
		
		
		headersMap.put("Authorization", "Basic  Z1FFc0duMlJVYmxYY2RNWlpmcUZuRzVhZkVP");
		headersMap.put("Accept", "application/json");
		headersMap.put("Content-Type", "application/x-www-form-urlencoded");


		Response resp= RestAssured.given().queryParams(qParam).headers(headersMap).post("http://ggeltestect010:8180/auth-service/v1/tokens/password");


//http://ggeltestect010.\auth-service/v1/tokens/password


		//In case we have to provide body in payload then its supplied like this.
		//RestAssured.given().queryParameters(qParam).and().headers(headersMap).body(body)
		

		/*
		Response resp=RestAssured.given().contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE).and().headers(headersMap).and().
				headers("Accept","application/json").and().queryParameters(qParam).when().
				post("http://ggeltestect01:8180/auth-service/v1/tokens");

		*/
		
/*		header("Content-Type","application/x-www-form-urlencoded")
		
		contentType(ContentType.URLENC)
		contentType("application/x-www-form-urlencoded")
		
		
	Response resp= given().contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE).and()
				.header("Authorization", "Basic  Y2OmF5bTA3Z1FFc0duMlJVYmxYY2RNWlpmcUZuRzVhZkVP")
				.and().queryParameters(qParam)
				.when()
				.post("http://ggeltestect010.net:8180/auth-service/v1/tokens");
*/



/*


REST assired uses builder pattern and all calls returns
RequestSpecification object e.g

RestAssured.given()
RestAssured.given().queryParam()


all return this;


now..

 */



/*


RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
RequestSpecification httpRequest = RestAssured.given();

Response response = httpRequest.get("/Hyderabad");

 */


		//For String response
		respMap=resp.getBody().as(Map.class); 

		int respCode=resp.getStatusCode();

		//REturns cookie map
		Map<String,String> cookieMap=resp.getCookies();

		//For key from response


	/*

	When self signed trusted certificate is used on https say for test purpose..then REST assured might give you error.
	so fix is to use at class level
	 */
	RestAssured.useRelaxedHTTPSValidation();


	JsonPath jpath =resp.jsonPath();

	jpath.getString("authToken");
	jpath.getInt("userID");




	//Iterating respone headers


	resp.headers();	//retuning rest assurd lib http header..

	for(Header header:resp.headers())
		{

			header.getName();
			header.getValue();
		}



		JSONObject respJson = new JSONObject(respMap);
		//System.out.println(respJson.toString());





}
	
	
	
}
