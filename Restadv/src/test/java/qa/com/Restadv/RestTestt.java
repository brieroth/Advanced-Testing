package qa.com.Restadv;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Test;


public class RestTestt{ 
RequestSpecification request;
Response response;

	ValidatableResponse json;

	@Test
	public void example() {
	
		request = given().contentType(ContentType.JSON);
		response = request.when().get("http://www.omdbapi.com/?t=Batman&apikey=a428acbb");
		json = response.then().statusCode(200);
	
	}
	}
