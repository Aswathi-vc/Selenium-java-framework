package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Bookstore_Parameterization {
	public static WebDriver driver;
	@Parameters({"p_user1","p_user2","p_user3","p_pwd"})
	
  @Test
  public void f(String firstname,String lastname,String username,String pwd) throws InterruptedException
	{
		driver.get("https://demoqa.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
	driver.findElement(By.xpath("(//*[text()='Register'])[2]")).click();
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
