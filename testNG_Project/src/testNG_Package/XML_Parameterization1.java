package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class XML_Parameterization1 {
	public WebDriver driver;
	@Test
	@Parameters({"p_user","p_pwd"})
  public void f(String user,String pwd)
	{
	  
	    driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
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
