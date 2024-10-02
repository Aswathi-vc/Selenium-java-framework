package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Musafir_page3 {
	public WebDriver driver;
	By Title=By.xpath("(//select[@tabindex='1'])[1]");
	By Fisrtname=By.xpath("//input[@placeholdevalue='First name']");
	By Lastname=By.xpath("//input[@placeholdevalue='Last name']");
	By DOB=By.xpath("//input[@placeholdevalue='Date of birth (dd/mm/yyyy)']");
	By nationality=By.xpath("//select[@class='country']");
	By passno=By.xpath("//input[@class='passportnum']");
	By passexpiry=By.xpath("//input[@placeholder='Passport expiry date (dd/mm/yyyy)']");
	By country=By.xpath("//select[@class='issue']");
	By email=By.xpath("//input[@type='email']");
	By phone=By.xpath("//input[@placeholder='Phone number']");
	By Continue=By.xpath("//*[@id=\"btnContinue\"]/i");
	public  Musafir_page3(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
	
	public void title(String tit) throws InterruptedException
	{
		WebElement b=driver.findElement(Title);
    	Select objselect=new Select(b);
    	objselect.selectByIndex(1);
    	Thread.sleep(2000);
	}
	public void firstname(String fname)
	{
		driver.findElement(Fisrtname).sendKeys(fname);
	}
	public void lastname(String lname)
	{
		driver.findElement(Lastname).sendKeys(lname);
	}
	public void DateofBirth(String dob)
	{
		driver.findElement(DOB).sendKeys(dob);	
		}
	public void Nationality(String national) throws InterruptedException
	{
	
		WebElement c=driver.findElement(nationality);
    	Select objselect=new Select(c);
    	objselect.selectByIndex(5);
    	Thread.sleep(2000);
	}
	public void Passport(String passnumber)
	{
		driver.findElement(passno).sendKeys(passnumber);
	}
	public void Passexpiry(String passexp)
	{
		driver.findElement(passexpiry).sendKeys(passexp);
	}
	public void Country(String cntry)
	{
		WebElement d=driver.findElement(country);
    	Select objselect=new Select(d);
    	objselect.selectByIndex(5);
	}
	public void Email(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void Ph(String PHONE)
	{
		driver.findElement(phone).sendKeys(PHONE);
	}
	public void Continue1()
	{
		driver.findElement(Continue).click();
	}
}
