package pagefactory_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newtours_Register {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")WebElement Registerpage;
	@FindBy(name="firstName") WebElement FisrtName;
	@FindBy(name="lastName") WebElement LastName;
	@FindBy(name="phone") WebElement Phone;
	
	public void Register()
	{
		Registerpage.click();
	}
	
	public Newtours_Register(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
}
	public void setstrfirstname(String strUserName)
	{
		FisrtName.sendKeys(strUserName);
	}
	public void setstrlastname(String strLastname)
	{
		LastName.sendKeys(strLastname);
	}
	public void setstrph(String strPH)
	{
		Phone.sendKeys(strPH);
	}
	public void Registernew(String strUserName,String strLastname,String strPH)
	{
		this.Register();
		this.setstrfirstname(strUserName);
		this.setstrlastname(strLastname);
		this.setstrph(strPH);
	}

}
