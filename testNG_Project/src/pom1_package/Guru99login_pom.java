package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Guru99login_pom {
	WebDriver driver;
	By username=By.xpath("//input[@name='uid']");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@name='btnLogin']");
	public Guru99login_pom(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
    public void UserName(String u)
    {
	driver.findElement(username).sendKeys(u);   
	}
    public void PassWord(String pass)
   {
	driver.findElement(password).sendKeys(pass);
    }
    public void Login()
    {
    	driver.findElement(login).click();
    }

}
