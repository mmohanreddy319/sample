package com.ebanking.testng;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterSuite;

public class Base 
{

TestngLb test = new TestngLb();

@BeforeSuite
public void BeforeSuite() throws InterruptedException 

{
	  test.Rnaford();
	  		
}


  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  
	  test.logout();
		
  }

  @BeforeTest
  public void BeforeTest() throws InterruptedException 
  
{
	 
	  test.admin();

		
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException 
  {
	 test.quit();
  }

}
