package pagefactorytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemo_pagefactory {
	WebDriver driver;
	@FindBy(name="user-name") WebElement usersuacedemo;
	@FindBy(name="password") WebElement passwordsaucedemo;
	@FindBy(name="login-button") WebElement login;

	public Saucedemo_pagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setUsername(String strUserName)
	{
		usersuacedemo.sendKeys(strUserName);
	}
	public void setPassword(String strpassword)
	{
		passwordsaucedemo.sendKeys(strpassword);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	public void saucedemosite(String strUserName,String strpassword)
	{
		this.setUsername(strUserName);
		this.setPassword(strpassword);
		this.clickLogin();
	}


	}

	

