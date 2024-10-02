package pom1_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Musafir_Main {
	
	public WebDriver driver;
	public Musafir_firstpage bookobj;
	public Musafir_page2 book1obj;
	public Musafir_page3 book2obj;
	  
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new ChromeDriver();
	bookobj=new Musafir_firstpage(driver);
	book1obj=new Musafir_page2(driver);
	book2obj=new Musafir_page3(driver);
       driver.get("https://in.musafir.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.manage().window().maximize();	  
  }
  @Test(priority=0)
  public void booking() throws InterruptedException
  
  {
 	  bookobj.from("Bengaluru, India (BLR)");
 	  bookobj.destination("Dubai International Airport, Dubai, United Arab Emirates (DXB)");
 	  bookobj.Start();
 	  bookobj.leave("2024-09-18");
 	  bookobj.end();
 	  bookobj.returns("24/09/26");
 	  bookobj.Adult("2 adults");
 	  bookobj.findflight();
  }
  @Test(priority=1)
  public void Book2()
  {
	 book1obj.Book();
  }
  @Test(priority=2)
  public void Book3() throws InterruptedException
  {
	 book2obj.title("Mr");
	 book2obj.firstname("Anil");
	 book2obj.lastname("tp");
	 book2obj.DateofBirth("10/10/1988");
	 book2obj.Nationality("American");
	 book2obj.Passport("123456678");
	 book2obj.Passexpiry("10/12/2028");
	 book2obj.Country("American samoa");
	 book2obj.Email("abc@gmail.com");
	 book2obj.Ph("1234567891");
	 book2obj.Continue1();

  }

  @AfterTest
  public void afterTest() {
  }

}
