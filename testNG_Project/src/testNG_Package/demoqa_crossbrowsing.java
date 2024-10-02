package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class demoqa_crossbrowsing {
	public static WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//button[@id='login']")).click();
  }
  @BeforeTest
  @Parameters("browser")
   public void beforeTestString (String br) {
		  if (br.equals("firefox"))
		  {
			  driver=new FirefoxDriver();
		  }
		  else if(br.equals("chrome")) 
		  {
			  driver=new ChromeDriver();
		  }
		  else if(br.equals("edge driver"))
		  {
			  driver=new EdgeDriver();
		  }
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
