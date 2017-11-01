package Project1.RestAssuredApi;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class ItunesApi {

		
	@Test(enabled=false)
	public void getRequest() throws IOException {
		RestAssured.baseURI = "https://itunes.apple.com";	
		RequestSpecification requestSpec = RestAssured.given();
		Response response = requestSpec.get("/search?term=jack+johnson");
		ResponseBody body = response.getBody();
		System.out.println(body.asString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		int jsonArraySize=jsonPathEvaluator.get("results.size()");	
		for(int i=0;i<jsonArraySize;i++) {
			System.out.println(jsonPathEvaluator.get("results["+i+"].wrapperType"));
			System.out.println(jsonPathEvaluator.get("results["+i+"].collectionId"));
			System.out.println(jsonPathEvaluator.get("results["+i+"].collectionName"));
			System.out.println(jsonPathEvaluator.get("results["+i+"].trackName"));
		
		}	
	}
		@Test
		public void getRequest2() throws IOException {
			RestAssured.baseURI = "https://maps.googleapis.com";	
			RequestSpecification requestSpec = RestAssured.given();
			Response response = requestSpec.get("/maps/api/distancematrix/json?origins=Vancouver+BC"
					+ "|Seattle&destinations=San+Francisco|Victoria+BC&key=AIzaSyDOUGYCn4XkXzlpw3rHfveXxseq8xt-cg0");
			ResponseBody body = response.getBody();
			JsonPath jsonPathEvaluator = response.jsonPath();
			
			System.out.println(jsonPathEvaluator.get("destination_addresses"));
			System.out.println(jsonPathEvaluator.get("origin_addresses"));
			
			int rows=jsonPathEvaluator.get("rows.size()");
			
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<rows;j++) {
					System.out.println("===================================================");
					System.out.println("Element"+j+" of row" +i);
					System.out.println("===================================================");
					System.out.println("distance.text:: "+jsonPathEvaluator.get("rows["+i+"].elements["+j+"].distance.text"));
					System.out.println("distance.value:: "+jsonPathEvaluator.get("rows["+i+"].elements["+j+"].distance.value"));
					System.out.println("duration.text:: "+jsonPathEvaluator.get("rows["+i+"].elements["+j+"].duration.text"));
					System.out.println("duration.value:: "+jsonPathEvaluator.get("rows["+i+"].elements["+j+"].duration.value"));
					System.out.println("status:: "+jsonPathEvaluator.get("rows["+i+"].elements["+j+"].status"));
					
				}
			}
		}
}






