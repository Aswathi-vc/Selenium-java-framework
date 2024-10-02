package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class dataprovideeparameterization {
	public WebDriver driver;
  @Test(dataProvider = "credentials")
  public void f(String uname, String pwd) throws InterruptedException {
	  
	 Thread.sleep(2000); 
	 driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }

  @DataProvider(name="credentials")
  public Object[][] dp() {
    return new Object[][]
    		{
    	
    	  {"maya","maya"},
    	  {"nivya","nivya"},
      	  {"izin","izin"}
    };
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
