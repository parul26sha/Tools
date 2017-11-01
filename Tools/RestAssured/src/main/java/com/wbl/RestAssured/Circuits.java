package com.wbl.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;  

public class Circuits {
	
	@Test(enabled =false)
	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
	        
	    given().
	    when().
	        get("http://ergast.com/api/f1/2016/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).and().assertThat().
	        body("MRData.CircuitTable.Circuits.circuitName",hasItem("Albert Park Grand Prix Circuit"));
	}
	
	
	@Test(enabled =false)
	public void test_ResponseHeaderData_ShouldBeCorrect() {
	        
	    given().
	    when().
	        get("http://ergast.com/api/f1/2017/circuits.json").
	    then().
	        assertThat().
	        statusCode(200).
	    and().
	        contentType(ContentType.JSON).
	    and().
	        header("Content-Length",equalTo("4551"));
	}
	
	@Test(enabled =false)
	public void test_Md5CheckSumForTest_ShouldBe098f6bcd4621d373cade4e832627b4f6() {
	    
	    String originalText = "test";
	    String expectedMd5CheckSum = "098f6bcd4621d373cade4e832627b4f6";
	        
	    given().
	        param("text",originalText).
	    when().
	        get("http://md5.jsontest.com").
	    then().
	        assertThat().
	        body("md5",equalTo(expectedMd5CheckSum));
	}

	@Test(dataProvider="driverConsructorData")
	
	public void test_NumberOfCircuits_ShouldBe20_Parameterized(String driver,String constructor) {
	        
	    String drivers = driver;
	    String constructors=constructor;
	    int numberOfRaces = 6;
	        
	    given().
	        pathParam("drivers",drivers).and().pathParam("constructors", constructors).
	    when().
	        get("http://ergast.com/api/f1/drivers/{drivers}/constructors/{constructors}/seasons.json").
	    then().
	        assertThat().
	        body("MRData.SeasonTable.Seasons",hasSize(numberOfRaces));
	}
	
	@DataProvider(name="driverConsructorData")
	public Object[][] dataProvider(){
		return new Object[][] {{"alonso","renault"}};			
	}
	
}
