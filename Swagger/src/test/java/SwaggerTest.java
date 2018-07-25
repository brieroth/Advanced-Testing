
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SwaggerTest {

	RequestSpecification request;
	Response response;
	ValidatableResponse json;

	@Before
	public void example() {
		request = given().contentType(ContentType.JSON);
		response = request.when().get("http://localhost:8090/example/v1/hotels?page=0&size=100");
		System.out.println(response.prettyPrint());
		json = response.then().statusCode(200);
		}

@Ignore
	@Test
	
	public void PostSwagger() {
		// start building the request parameters
		JSONObject obj = new JSONObject();
		obj.put("city", "Manchester");
		obj.put("description", "This is a test");
		obj.put("name", "Kevin");
		obj.put("rating", 10);
		System.out.println(request.body(obj.toString()));
		// finally send the request we have built up
		Response response = request.post("http://localhost:8090/example/v1/hotels");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		}
@Ignore
	@Test
		public void update() {
		JSONObject obj = new JSONObject();
		obj.put("city", "Liverpool");
		obj.put("id", 14);
		obj.put("description", "new location");
		obj.put("name", "George");
		obj.put("rating", 9);
		System.out.println(request.body(obj.toString()));
		Response response = request.post("http://localhost:8090/example/v1/hotels");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		}
@Ignore
	@Test
		public void deleteT() {
		Response response = request.delete("http://localhost:8090/example/v1/hotels/13");
		System.out.println(response.getStatusCode());
		}
	
	@Test
	public void getHotel() {
	Response response = request.get("http://localhost:8090/example/v1/hotels/14");
	System.out.println(response.getStatusCode());
	System.out.println(response.prettyPrint());
	}
}
