package pom1_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTourTestNG {
	public WebDriver driver;
	public Login_page loginobj;
	public Registration regobj;
 
  @BeforeTest
  public void beforeTest() {
	  
	driver=new ChromeDriver();
	loginobj=new Login_page(driver);
	regobj=new Registration(driver);
	driver.get("https://demo.guru99.com/test/newtours/");	  
	driver.manage().window().maximize();
	  
  }
  
  @Test(priority=0)
  
 public void Login1()
 {
	  loginobj.Username("izin");
	  loginobj.Password("izin");
	  loginobj.login();
 }
  
  @Test(priority=1)
  
  public void Register1() throws InterruptedException
  {
 	  regobj.registration();
 	  regobj.Firstname("Aswathi");
 	  regobj.Lastname("VC");
 	  regobj.Phone("1234567");
 	  regobj.Email("abcd@gmail.com");
 	  regobj.Address("abcd");
 	  regobj.city("Kannur");
 	  regobj.state("Kerala");
 	  regobj.postal("670501");
 	  regobj.country("ALGERIA");
 	  regobj.username("Aswathi");
 	  regobj.password("123@");
 	  regobj.Confirm("123@");
 	  regobj.Submit();
  }
 
  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
