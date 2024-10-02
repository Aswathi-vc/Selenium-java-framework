package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	public WebDriver driver;
	By Uname=By.xpath("//input[@name='userName']");
	By pwd=By.xpath("//input[@type='password']");
	By login=By.xpath("//input[@type='submit']");
	public Login_page(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
    public void Username(String u)
    {
	driver.findElement(Uname).sendKeys(u);
    }
    public void Password(String password)
   {
	driver.findElement(pwd).sendKeys(password);
    }
    public void login()
    {
	driver.findElement(login).click();
    }
}

