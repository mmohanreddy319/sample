package com.ebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

public class Roles 
{

WebDriver driver;
	
  
  
		   @FindBy(xpath = "//input[@id='txtRname']")
		   private WebElement rolename;

		   @FindBy(xpath = "//input[@id='txtRDesc']")
		   private WebElement roledescription;

		   @FindBy(xpath = "//select[@id='lstRtypeN']")
		   private WebElement roleType;

		   @FindBy(xpath = "//input[@id='btninsert']")
		   private WebElement rolesubmit;
		   	   
		   
     
	public  void roledtls(String Name,String desc, String roletype)

	{
	
		rolename.sendKeys(Name);
   
		
	
			roledescription.sendKeys(desc);
			   

			Select Roletype = new Select(roleType);
			
			Roletype.selectByVisibleText(roletype);

		
			rolesubmit.click();

			

		}
		
		
	
	}