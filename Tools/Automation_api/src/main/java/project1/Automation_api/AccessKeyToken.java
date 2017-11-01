package project1.Automation_api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

public class AccessKeyToken {
	
	protected String accessTokenValue;
	
	public String  getAccessToken(String fileName) {
		
		
		Properties prop=new ConfigUtils().SetProperties(fileName);
		HttpClient httpClient=HttpClientBuilder.create().build();
		ResponsePayLoad payLoad=new ResponsePayLoad();
		String url=prop.getProperty("Aouth_url");
		
		System.out.println(url);
		HttpPost post=new HttpPost(url);
		post.setHeader(prop.getProperty("Header"),prop.getProperty("Header_Value"));		
		try {
			String requestPayLoad="{\n" + 
					"	\"app_type\":\"talentscreen\",\n" + 
					"	\"email_address\":\"kumar@whitebox-learning.com\",\n" + 
					"	\"password\":\"Excellence@123\",\n" + 
					"	\"type\":\"login\"\n" + 
					"}";
			HttpEntity entity = new StringEntity(requestPayLoad);
			post.setEntity(entity);
			HttpResponse response=httpClient.execute(post);
			payLoad.setPayload(IOUtils.toString(response.getEntity().getContent()));
			payLoad.setStatusCode(response.getStatusLine().getStatusCode());
			JSONObject jsonObject=new JSONObject(payLoad.getPayload());
			accessTokenValue=jsonObject.get("token").toString();
			
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop =ConfigUtils.SetProperties(fileName);
		return accessTokenValue;
	}
	
	
	
}