package pagefactorytest;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Saucedemomain_pagefactory {
	WebDriver driver;
	Saucedemo_pagefactory objLogin;
	
  
  @BeforeTest 
  public void setup() {
	  driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");  
  }
  @Test(priority=0)
  public void f() {
	  objLogin=new Saucedemo_pagefactory(driver);
	  objLogin.saucedemosite("standard_user","secret_sauce");
	
  }
  
  @AfterTest
  public void afterTest() {
  
  }

}
