package sheet_package;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Exceldatadriven {
	
public WebDriver driver;
  @Test(dataProvider="testdata")
  
  public void DemoProject(String username,String password) throws InterruptedException 
  {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/"); 
	  
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(5000);  
	  }

  @AfterMethod
  public void programTermination() {
	driver.quit();	  
  }
  @DataProvider(name="testdata")
	 public Object[][] TestDataFeed()
	 {
	  
	 ReadExcelfile config = new ReadExcelfile("C:\\Users\\anilp\\Desktop\\test.xlsx");
	  
	 int rows = config.getRowCount(0);//rows=4;
	  
	 Object[][] credentials = new Object[rows][2];
	 
	for(int i=0;i<rows;i++)//i=0,1,2,3
	 {
	 credentials[i][0] = config.getData(0, i, 0);
	 credentials[i][1] = config.getData(0, i, 1);
	 }
	  
	 return credentials;
	 }
	}
