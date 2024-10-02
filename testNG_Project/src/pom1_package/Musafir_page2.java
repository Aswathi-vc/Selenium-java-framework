package pom1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Musafir_page2 {
	public WebDriver driver;
	
	By booking=By.xpath("//*[@id=\"flightScreenRight\"]/div/div[2]/div[2]/div[23]/div/div/div[1]/div[3]/button");
	
	public  Musafir_page2(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
	public void Book()
	{
		driver.findElement(booking).click();
	}
}
