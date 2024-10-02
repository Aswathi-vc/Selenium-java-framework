package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Rogersoftapps1 {
	public WebDriver driver;
  @Test
  @Parameters({"p_user","p_pwd"})
  
 public void f(String user,String pwd)
		{
		  
	  driver.get("http://rogersoftapps.com/test_env/admin.careofminds.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"login-verify\"]/a")).click(); 
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
