package testNG_Package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Softassert1 {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//input[@name='login-button']")).click();
	  String  expecteurl="https://www.saucedemo.com/inventory.html";
	  String actualurl=driver.getCurrentUrl();
	  SoftAssert softassert1=new SoftAssert();
	  softassert1.assertEquals(actualurl, expecteurl);
	  System.out.println("Assertion done");
	  softassert1.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	driver.close();
  }

}
