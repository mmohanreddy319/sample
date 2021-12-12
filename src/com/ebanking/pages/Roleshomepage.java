package com.ebanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roleshomepage 
{
	 @FindBy(xpath="//input[@id='btnRoles']")
	   private   WebElement newrole;

	 @FindBy(xpath="//a[@href='adminflow.aspx']//img")
	   private   WebElement home;

	 
	 public void Home() 
		
     {		
		 home.click();			
			
     }	
	 
	 public void newRole() 
		
     {		
    	 newrole.click();			
			
     }	

}
