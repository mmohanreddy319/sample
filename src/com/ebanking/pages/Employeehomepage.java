package com.ebanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employeehomepage 
{
	
	
	@FindBy(xpath="//input[@id='BtnNew']")
	   private   WebElement newemployee;

	 @FindBy(xpath="//a[@href='adminflow.aspx']//img")
	   private   WebElement home;

	 
	 public void Home() 
		
  {		
		 home.click();			
			
  }	
	 
	 public void Newemployee() 
		
  {		
		 newemployee.click();			
			
  }	


}
