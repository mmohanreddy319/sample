package com.ebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Ranfordpage 
{
WebDriver driver;
	
			@FindBy(xpath = "//input[@id='txtuId']")
			private WebElement username;

		   @FindBy(xpath = "//input[@id='txtPword']")
		   private   WebElement password;

		   @FindBy(xpath = "//input[@id='login']")
		   private WebElement loginbutton;

		      
     public void usernme() 
     
     {
    	 username.sendKeys("Admin");
		
     }
			
     public void pswd() 
			
     {
				
    	 password.sendKeys("Testing@");		
			
     }	  
	

	public  void lgnbtn()

	{
	
		loginbutton.click();
   
		
	}
		
	

}
