package Twitter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import Project.Api_Automation.LoadProperties;

public class TwitterGetRequest{
	
	@Test
	public void get() {
		HttpClient httpClient=HttpClientBuilder.create().build();
		Properties prop=new Properties();
		prop=new LoadProperties().Load("config.properties");
		
		String url=(String) prop.get("URL");
		HttpGet get=new HttpGet(url);
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(prop.getProperty("Consumerkey"),prop.getProperty("ConsumerSecret"));
		consumer.setTokenWithSecret(prop.getProperty("Token"),(prop.getProperty("TokenSecret")));
		try {
			consumer.sign(get);
			HttpResponse response =httpClient.execute(get);
			System.out.println(response.getStatusLine().getStatusCode());
			//assertNotEquals(response.getStatusLine().getStatusCode(),404);
		
		
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
