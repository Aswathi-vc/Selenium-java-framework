package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newcustomer_pom {
	WebDriver driver;
	By newcustomer=By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By Custname=By.xpath("//input[@name='name']");
	By Gender=By.xpath("//input[@value='f']");
	By DOB=By.xpath("//input[@name='dob']");
	By Address=By.xpath("//textarea[@name='addr']");
	By Cityname=By.xpath("//input[@name='city']");
	By Statename=By.xpath("//input[@name='state']");
	By PIN=By.xpath("//input[@name='pinno']");
	By PHONE=By.xpath("//input[@name='telephoneno']");
	By MAIL=By.xpath("//input[@name='emailid']");
	By Pass=By.xpath("//input[@name='password']");
	By sub=By.xpath("//input[@name='sub']");
	
	
	
	public Newcustomer_pom(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
	public void Newcustomer()
    {
	driver.findElement(newcustomer).click();  
	}
    public void Customername(String cuname)
   {
	driver.findElement(Custname).sendKeys(cuname);
    }
    public void gender()
    {
    	driver.findElement(Gender).click();
    }
    public void dob(String date)
    {
    	driver.findElement(DOB).sendKeys(date);
    }
    public void address(String adr)
    {
    	driver.findElement(Address).sendKeys(adr);
    }
    public void City(String cit)
    {
    	driver.findElement(Cityname).sendKeys(cit);
    }
    public void statename(String stat)
    {
    	driver.findElement(Statename).sendKeys(stat);
    }
    public void pino(String pin)
    {
    	driver.findElement(PIN).sendKeys(pin);
    }
    public void phone(String ph)
    {
    	driver.findElement(PHONE).sendKeys(ph);
    }
    public void mail(String email)
    {
    	driver.findElement(MAIL).sendKeys(email);
    }
    public void Password(String pswd)
    {
    	driver.findElement(Pass).sendKeys(pswd);
    }
    public void submit()
    {
    	driver.findElement(sub).click();
    }
}
