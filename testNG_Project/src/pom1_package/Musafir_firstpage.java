package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Musafir_firstpage {
	
	public WebDriver driver;
	
	By From=By.xpath("//input[@name='Origin']");
	By Destination=By.xpath("//input[@name='Destination']");
	By start=By.xpath("//input[@name='StartDate']");
	By Leave=By.xpath("//li[@date='2024-09-18']");
	By End=By.xpath("//input[@name='EndDate']");
	By Return=By.xpath("//li[@date='2024-09-26']");
	By adult=By.xpath("//select[@name='AdultsFlight']");
	By Findflight=By.xpath("//a[@class='optional submit button yellow flightsOnly_all buttonBound customButton']");
	public  Musafir_firstpage(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
    public void from(String u)
    {
	driver.findElement(From).sendKeys(u);
    }
    public void destination(String dest)
   {
	driver.findElement(Destination).sendKeys(dest);
    }
    public void Start()
    {
    	driver.findElement(start).click();
    }
    public void leave(String startdate)
    {
    	driver.findElement(Leave).click();
    	}
    public void end()
    {
    	driver.findElement(End).click();
    }
    public void returns(String ret)
    {
    	driver.findElement(Return).click();
    }
    public void Adult(String adl) throws InterruptedException
    {
    	WebElement a=driver.findElement(adult);
    	Select objselect=new Select(a);
    	objselect.selectByIndex(0);
    	Thread.sleep(2000);
    }
    public void findflight()
    {
    	driver.findElement(Findflight).click();
    }
    
}

