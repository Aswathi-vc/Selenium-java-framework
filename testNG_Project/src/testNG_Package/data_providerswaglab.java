package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class data_providerswaglab {
	
	public WebDriver driver;
  @Test(dataProvider = "credentials")
 
  public void f(String uname , String pwd) throws InterruptedException {
	  Thread.sleep(2000); 
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
  }

  @DataProvider(name="credentials")
  public Object[][] dp() {
    return new Object[][] {
              {"standard_user","secret_sauce"},
      	      {"locked_out_user","secret_sauce"},
        	  {"problem_user","secret_sauce"},
      	    {"performance_glitch_user","secret_sauce"},
      	  {"error_user","secret_sauce"},
      	{"visual_user","secret_sauce"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
  }

}
