package pagefactory_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newtours_login {
	WebDriver driver;
	@FindBy(name="userName") WebElement usernewtourName;
	@FindBy(name="password") WebElement usernewtourpassword;
	@FindBy(name="submit") WebElement login;
	
public Newtours_login(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void setUsername(String strUserName)
{
	usernewtourName.sendKeys(strUserName);
}
public void setPassword(String strPassword)
{
	usernewtourpassword.sendKeys(strPassword);
}
public void clickLogin()
{
	login.click();
}
public void LoginTonewtour(String strUserName,String strPassword)
{
	this.setUsername(strUserName);
	this.setPassword(strPassword);
	this.clickLogin();
}	
	
}
