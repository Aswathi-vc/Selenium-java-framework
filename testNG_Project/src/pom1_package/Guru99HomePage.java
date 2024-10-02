package pom1_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage {
	
	WebDriver driver;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")WebElement homePageUserName;

	public Guru99HomePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		}
	
	public String getHomePageDashboardUserName()
	{
		return homePageUserName.getText();
	}
}
