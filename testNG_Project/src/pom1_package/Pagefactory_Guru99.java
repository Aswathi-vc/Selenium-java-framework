package pom1_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory_Guru99 {

	WebDriver driver;
@FindBy(name="uid") WebElement user99GuruName;
@FindBy(name="password") WebElement password99Guru;
@FindBy(className="barone") WebElement titleText;
@FindBy(name="btnLogin") WebElement login;


public Pagefactory_Guru99(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void setUsername(String strUserName)
{
	user99GuruName.sendKeys(strUserName);
}
public void setPassword(String strpassword)
{
	password99Guru.sendKeys(strpassword);
}
public String getLoginTitle()
{
	return titleText.getText();
}
public void clickLogin()
{
	login.click();
}
public void LoginToGuru99(String strUserName,String strpassword)
{
	this.setUsername(strUserName);
	this.setPassword(strpassword);
	this.clickLogin();
}


}
