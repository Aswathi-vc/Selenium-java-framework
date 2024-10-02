package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assertion2 {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.flipkart.com/");
	  driver.navigate().to("https://www.amazon.com/");
	  driver.navigate().to("https://www.ebay.com/");
	  driver.navigate().back();
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  String  expectedurl="https://www.amazon.com/";
	  String actualurl=driver.getCurrentUrl();
	  System.out.println(actualurl);
	  Assert.assertEquals(actualurl, expectedurl,"failed");
	  System.out.println("Successful");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
