package com.ebay;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Addtocart {
	
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver","/home/parul/Downloads/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void addToCart() throws AWTException, InterruptedException {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","test_db","rts");   
			Statement stmt=con.createStatement();  
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
			WebElement elem=driver.findElement(By.cssSelector("div[class='nav-search-submit nav-sprite'] span[id='nav-search-submit-text']"));
			elem.click();
			elem=driver.findElement(By.cssSelector("#result_0 .a-size-medium.s-inline.s-access-title.a-text-normal"));
			elem.click();
			elem=driver.findElement(By.id("productTitle"));
			
			List<CartItems>cartItems=new ArrayList<CartItems>();
			CartItems item=new CartItems(elem.getText(), Float.parseFloat(driver.findElement(By.id("priceblock_ourprice"))
					.getText().replaceAll("[$,]", "").toString()),1,"Not Purchased");
			cartItems.add(item);
			stmt.executeQuery("insert into PurchaseOrder values('"+elem.getText()+"',"+driver.findElement(By.id("priceblock_ourprice"))
			.getText().replaceAll("[$,]", "")+","+1+",'Not Purchased')");
			stmt.executeQuery("commit");
			 
			
			elem =driver.findElement(By.id("add-to-cart-button"));
			elem.click();
			

			String parentWindow=driver.getWindowHandle();
			Set<String> allWindows=driver.getWindowHandles();
			WebDriverWait wait=new WebDriverWait(driver,30);
			for(String s:allWindows) {
				if(s!=parentWindow) {
					driver.switchTo().window(s);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("siAddCoverage-announce")));
					driver.findElement(By.id("siAddCoverage-announce")).click();
				}
			}
			
			
			wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".a-size-medium.a-text-bold")));
		
			/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches for women");
			driver.findElement(By.cssSelector("#nav-search  [type='submit']")).click();
			
		
			if(driver.findElement(By.cssSelector(".a-dropdown-prompt")).isDisplayed()) {
				driver.findElement(By.cssSelector(".a-dropdown-prompt")).click();
				driver.findElement(By.cssSelector("native_dropdown_selected_size_name_1")).click();
			}
			
			driver.findElement(By.cssSelector("#result_0 .a-size-medium.s-inline.s-access-title.a-text-normal")).click();
			elem=driver.findElement(By.cssSelector("#productTitle"));
			
			stmt.executeQuery("insert into PurchaseOrder values('"+elem.getText()+"',"+driver.findElement(By.id("priceblock_saleprice"))
			.getText().replaceAll("[$,]", "")+","+1+")");
			stmt.executeQuery("commit");
			
			elem =driver.findElement(By.id("add-to-cart-button"));
			elem.sendKeys(Keys.ENTER);
			driver.findElement(By.cssSelector(".nav-cart-icon.nav-sprite")).click();*/
			
			driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
			driver.findElement(By.id("ap_email")).sendKeys("parul26sha@yahoo.com");
			driver.findElement(By.id("ap_password")).sendKeys("parul1234");
			driver.findElement(By.id("signInSubmit")).click();
		
			
			driver.findElement(By.id("enterAddressFullName")).sendKeys("Parul Sharma");
			driver.findElement(By.id("enterAddressAddressLine1")).sendKeys("3229 El camino Real");
			driver.findElement(By.id("enterAddressAddressLine2")).sendKeys("apt 314");
			driver.findElement(By.id("enterAddressCity")).sendKeys("Santa Clara");
			driver.findElement(By.id("enterAddressStateOrRegion")).sendKeys("CA");
			driver.findElement(By.id("enterAddressPostalCode")).sendKeys("95051");
			Select select =new Select(driver.findElement(By.cssSelector("#enterAddressCountryCode")));
			select.selectByVisibleText("United States");
			driver.findElement(By.cssSelector("#enterAddressPhoneNumber")).sendKeys("6692388588");
			driver.findElement(By.xpath(".//*[@id='newShippingAddressFormFromIdentity']/div[1]/div/form/div[8]/span/span/input")).click();
			String purchaseURL=driver.getCurrentUrl();
			driver.findElement(By.xpath(".//*[@id='shippingOptionFormId']/div[1]/div[1]/h1"));
			if(purchaseURL=="https://www.amazon.com/gp/buy/shipoptionselect/handlers/display.html?hasWorkingJavascript=1") {
				System.out.println("---------->>>>>>>>");
				stmt.executeQuery("update PurchaseOrder set Status='Purchased' where ProductName='"+cartItems.get(1).productName+"'");
				stmt.executeQuery("commit");
			}
		//	
		
			con.close();    
		}
	
		catch(Exception e){
			System.out.println(e);
		} 
		driver.close();
		
		
		
		
	}

}