package pagefactorytest;

import org.testng.annotations.Test;
import pagefactory_package.Newtours_Register;
import pagefactory_package.Newtours_login;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTours_pagefactory {
	WebDriver driver;
	Newtours_login objLogin;
	Newtours_Register objRegister;
	@BeforeTest
	public void setup() {
		  driver=new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/newtours/"); 
	}
 
  @Test(priority=0)
  public void test_Home_page_Appear_correct()
  {
	  objLogin=new Newtours_login(driver);
	  
	  objLogin.LoginTonewtour("maya","maya");
	  objRegister=new Newtours_Register(driver);
	  objRegister.Registernew("aswathi","vc", "1234");
	 
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
