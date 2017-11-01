package Twitter;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.testng.annotations.Test;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class TwitterPostRequest {
	@Test
	public void post() {
		HttpClient httpClient=HttpClientBuilder.create().build();
		Properties prop=new Properties();
		prop=new LoadProperties().Load("config.properties");
		String url=(String) prop.get("URL");
		HttpPost postRequest=new HttpPost(url);
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(prop.getProperty("Consumerkey"),prop.getProperty("ConsumerSecret"));
		consumer.setTokenWithSecret(prop.getProperty("Token"),(prop.getProperty("TokenSecret")));
		try {
			consumer.sign(postRequest);
			HttpResponse response =httpClient.execute(postRequest);
			assertEquals(response.getStatusLine().getStatusCode(),200);
			 BufferedReader streamReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		     StringBuilder responseStrBuilder = new StringBuilder();
		     String inputStr;
		     while ((inputStr = streamReader.readLine()) != null)
		    	 responseStrBuilder.append(inputStr);

		     JSONObject jsonObject = new JSONObject(responseStrBuilder.toString());
		     assertEquals(jsonObject.getJSONObject("time_zone").get("name"),"Pacific Time (US & Canada)");
		     assertEquals(jsonObject.get("language"),"de");

			
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthMessageSignerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthExpectationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthCommunicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
