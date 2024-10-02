package pagefactorytest;


import org.testng.annotations.Test;

import graphql.Assert;
import pom1_package.Pagefactory_Guru99;
import pom1_package.Guru99HomePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Guru99_pagefactory {
	WebDriver driver;
	Pagefactory_Guru99 objLogin;
	Guru99HomePage objHomepage;
 
  @BeforeTest
  public void setup() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/V4/");  
  }
  @Test(priority=0)
  public void test_Home_page_Appear_correct()
  {
	  objLogin=new Pagefactory_Guru99(driver);
	  String LoginPageTitle=objLogin.getLoginTitle();
	  Assert.assertTrue(LoginPageTitle.toLowerCase().contains("guru99 bank"));
	  objLogin.LoginToGuru99("mngr590197","bYnUgUd");
	  objHomepage=new Guru99HomePage(driver);
	  Assert.assertTrue(objHomepage.getHomePageDashboardUserName().contains("Manger Id : mngr590197"));
  }
  

  @AfterTest
  public void afterTest() {
  }

}
