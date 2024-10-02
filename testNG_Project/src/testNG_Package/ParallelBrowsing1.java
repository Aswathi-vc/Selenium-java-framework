package testNG_Package;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class ParallelBrowsing1 {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  
  }
  @Test
  public void g() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com/");
	  
  }
}
