package testNG_Package;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SwagLab1 {
	public static WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//input[@name='login-button']")).click();
	  String  expectedurl="https://www.saucedemo.com/inventory.html";
	  String actualurl=driver.getCurrentUrl()	;
	  System.out.println(actualurl);
	//  Assert.assertEquals(actualTitle, expectedTitle, actualTitle)
	  Assert.assertEquals(actualurl, expectedurl,"Login failed");
 System.out.println("Login done");

	  
	  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
