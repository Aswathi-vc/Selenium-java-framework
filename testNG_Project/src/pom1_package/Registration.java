package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public WebDriver driver;
	By reg=By.xpath("//*[text()='REGISTER']");
	By fname=By.xpath("//input[@name='firstName']");
	By lname=By.xpath("//input[@name='lastName']");
	By phone=By.xpath("//input[@name='phone']");
	By email=By.xpath("//input[@name='userName']");
	By address=By.xpath("//input[@name='address1']");
	By City=By.xpath("//input[@name='city']");
	By State=By.xpath("//input[@name='state']");
	By Postal=By.xpath("//input[@name='postalCode']");
	By Country=By.xpath("//select[@name='country']");
	By Username=By.xpath("//input[@name='email']");
	By Password=By.xpath("//input[@name='password']");
	By confirm=By.xpath("//input[@name='confirmPassword']");
	By submit=By.xpath("//input[@type='submit']");
	
	public Registration (WebDriver driver) 
	{
		this.driver=driver;
	}
	public void registration()
	{
		driver.findElement(reg).click();
	}
	public void Firstname(String firstname)
	{
		driver.findElement(fname).sendKeys(firstname);
	}
	public void Lastname(String lastname)
	{
		driver.findElement(lname).sendKeys(lastname);
	}
	public void Phone(String ph)
	{
		driver.findElement(phone).sendKeys(ph);
	}
	public void Email(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void Address(String addr)
	{
		driver.findElement(address).sendKeys( addr);
	}
	public void city(String cit)
	{
		driver.findElement(City).sendKeys(cit);
	}
	public void state(String stat)
	{
		driver.findElement(State).sendKeys(stat);
	}
	public void postal(String post)
	{
		driver.findElement(Postal).sendKeys(post);
	}
	public void country(String cntry) throws InterruptedException
	{
	
	WebElement y=driver.findElement(Country);
		Select dropselect=new Select(y);
	Thread.sleep(2000);
	dropselect.selectByIndex(1);
	}
	public void username(String uname)
	{
		driver.findElement(Username).sendKeys(uname);
	}
	public void password(String pswd)
	{
		driver.findElement(Password).sendKeys(pswd);
	}
	public void Confirm(String cnfrm)
	{
		driver.findElement(confirm).sendKeys(cnfrm);
	}
	public void Submit()
	{
		driver.findElement(submit).click();
	}

}
