package com.wbl.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.wbl.pages.HomePage;
import com.wbl.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginSmokeTest {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	String actual;
	
	@Given("^user is able to access the homePgae of talentscreen and click login button$")
	public void user_is_able_to_access_the_homePgae_of_talentscreen_and_click_login_button() throws Throwable {
	    System.out.println("In Given");
	    driver = Hooks.driver;
	    hp=new HomePage(driver);
		lp=hp.clickLogin();
	}

	@When("^User enters the credentials$")
	public void user_enters_the_credentials(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("In When");
		
	}
	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
		//actual=lp.login();
		 
	}

	@Then("^The user should be navigated to the Login Success HomePage$")
	public void the_user_should_be_navigated_to_the_Login_Success_HomePage() throws Throwable {
		 System.out.println("In Then");
		 Assert.assertNotNull(actual);
	}
	
	@When("^User clicks facebook login button$")
	public void user_clicks_facebook_login_button() throws Throwable {
		lp.loginWithFacebook();
	}

	@Then("^The user should be navigated to the facebook login page$")
	public void the_user_should_be_navigated_to_the_facebook_login_page() throws Throwable {
	   System.out.println("-->>");
		// Assert.assertEquals("https://www.facebook.com/login.php?skip_api_login=1&api_key=896704180481961&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.10%2Fdialog%2Foauth%3Fredirect_uri%3Dhttps%253A%252F%252Fapp.talentscreen.io%252F%26display%3Dpopup%26scope%3Demail%26response_type%3Dcode%26client_id%3D896704180481961%26ret%3Dlogin%26logger_id%3D25e748d5-c5d9-372e-0296-4d5793ac51c2&cancel_url=https%3A%2F%2Fapp.talentscreen.io%2F%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%23_%3D_&display=popup&locale=en_US&logger_id=25e748d5-c5d9-372e-0296-4d5793ac51c2", actual);
	}



	
	

}
