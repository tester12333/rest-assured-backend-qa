package Request;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import Data.JsonReuse;
import Data.PayLoad;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	public static Response  Postreq(int totalSet , int adultNum , int chiledNum , int infant , String dateFrom, String dateTo) {
		 return given().header("Content-Type","application/json")
	    .body(PayLoad.PostBody(totalSet , adultNum , chiledNum , infant , dateFrom, dateTo))
		.when().post("/api/v3/flights/flight/async-search-result");
//		.then().statusCode(200);
		
//		JsonPath responseJson = JsonReuse.jsonRow(responseString);
		
		
		
	}
}
