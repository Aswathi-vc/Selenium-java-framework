package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swaglagparameterization {
	public static WebDriver driver;
	@Parameters({"p_user","p_pwd"})
  @Test
  public void f(String user,String pwd) throws InterruptedException {
	   driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
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
