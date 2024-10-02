package pom1_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewtoursMain_POM {
	
	public WebDriver driver;
	public Guru99login_pom loginpage;
	public Newcustomer_pom newcustomer;
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  loginpage=new Guru99login_pom(driver);
	  newcustomer=new Newcustomer_pom(driver);
	driver.get("https://demo.guru99.com/v4/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			driver.manage().window().maximize();
  }
  @Test(priority=0)
  public void Log() throws InterruptedException
  {
 	  loginpage.UserName("mngr590197");
 	  loginpage.PassWord("bYnUgUd");
 	  loginpage.Login();
 	  
  }
  @Test(priority=1)
  public void newcust() throws InterruptedException
  {
	  newcustomer.Newcustomer();
	  newcustomer.Customername("Aswathi");
	  newcustomer.gender();
	  newcustomer.dob("27-09-1992");
	  newcustomer.address("Basavanagar");
	  newcustomer.City("Bangalore");
	  newcustomer.statename("Karnataka");
	  newcustomer.pino("560037");
	  newcustomer.phone("123456");
	  newcustomer.mail("abc@gmail.com");
	  newcustomer.Password("1234@A");
	  newcustomer.submit();
 	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
