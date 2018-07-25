package qa.com.Restadv;

import static io.restassured.RestAssured.given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import static org.hamcrest.Matchers.*;

public class Runner 
{
	RequestSpecification request;
	Response response;

	ValidatableResponse json;

	@Given("^a film exists with the Title Batman$")
	public void a_film_exists_with_the_Title_Batman() {
	request = given().contentType(ContentType.JSON);
	}
	
	@When("^a user retrieves the film by title$")
	public void a_user_retrieves_the_film_by_title() {
	response = request.when().get("http://www.omdbapi.com/?apikey=[YOUR API KEY]&t=Batman");
	}
	
	@Then("^the status code reads 200$")
	public void the_status_code_reads(int statusCode) {
	json = response.then().statusCode(200);
	}
	
	 
	 
}
