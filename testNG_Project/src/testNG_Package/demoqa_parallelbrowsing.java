package testNG_Package;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class demoqa_parallelbrowsing {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//button[@id='login']")).click();
  }
  @Test
  public void g() {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//button[@id='login']")).click();
  }
  @Test
  public void h() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ABCabc123!@#");
	  driver.findElement(By.xpath("//button[@id='login']")).click();
  }
}
