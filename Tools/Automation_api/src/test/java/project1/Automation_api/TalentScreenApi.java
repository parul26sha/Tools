package project1.Automation_api;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TalentScreenApi {
	
	BaseApi api;
	ResponsePayLoad payload;
	Properties resource;
	private  List<Integer> id ;
	private Iterator<Integer> iterator;

	@BeforeClass
	public void  beforeClass() {
		
		api=new BaseApi("confi.properties");
		payload=new ResponsePayLoad();
		id= new ArrayList<Integer>();
		resource=ConfigUtils.SetProperties("confi.properties");
	
	}
	@Test(priority=0)
	public void getRequest() {
		payload=api.get(resource.getProperty("resource"));
		assertEquals(payload.getStatusCode(),200);		
	}
	
	
	@Test(priority=2,dataProvider="PostRequest")
	public void postRequest(String requestPayLoad) throws InterruptedException {
		api.post(resource.getProperty("resource"),requestPayLoad);
		assertEquals(payload.getStatusCode(),201);
		JSONObject jsonObject=new JSONObject(payload.getPayload());
		id.add((Integer) jsonObject.get("id"));
		iterator=id.iterator();
	}
	
	@Test(priority =3,dataProvider="PutRequest")
	public void putRequest(String requestPayLoad ) {
		payload=api.put(resource.getProperty("resource"),iterator.next(),requestPayLoad);
			assertEquals(payload.getStatusCode(),200);
			JSONObject jsonObject=new JSONObject(payload.getPayload());
		}
	@Test(priority =4)
	public void deleteRequest() {
		iterator=id.iterator();
		while(iterator.hasNext()) {
			payload=api.delete(resource.getProperty("resource"),iterator.next().toString());		
			assertEquals(payload.getStatusCode(),204);
		}
	}
	
	@DataProvider(name="PostRequest")
	public Object[][] postRequestPayLoad(){
		Object [][] obj=new RequestData().postRequestPayLoad();
		return obj;
	}
	@DataProvider(name="PutRequest")
	public  Object[][] putRequestPayLoad(){
		Object [][] obj=new RequestData().putRequestPayLoad();
		return obj;
	}
	
}


	
	
	