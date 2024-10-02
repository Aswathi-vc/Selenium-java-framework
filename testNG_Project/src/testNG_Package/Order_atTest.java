package testNG_Package;

import org.testng.annotations.Test;

public class Order_atTest {
  @Test(priority=0)
  public void signin() {
	  System.out.println("This is signin");
  }

  @Test(priority=2)
  public void admin() {
	  System.out.println("This is admin");

  }
  
  @Test(priority=1)
  public void logout() {
	  System.out.println("This is logout");

  }
  @Test(priority=3)
  public void feedback() {
	  System.out.println("This is feedback");

  }





}

