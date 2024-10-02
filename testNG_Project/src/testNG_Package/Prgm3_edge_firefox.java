package testNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Prgm3_edge_firefox {
	public static WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.co.in/");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
	  //driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
