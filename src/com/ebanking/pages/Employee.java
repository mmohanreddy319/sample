package com.ebanking.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Employee 

{
	
	
	
	@FindBy(xpath="//input[@id='txtUname']")
	   private   WebElement employeename;

	 @FindBy(xpath="//input[@id='txtLpwd']")
	   private   WebElement employeeusername;
	 
	 @FindBy(xpath="//select[@id='lst_Roles']")
	   private   WebElement employeepassword;
	 
	 @FindBy(xpath="//select[@id='lst_Branch']")
	   private   WebElement employeebranch;

	 @FindBy(xpath="//input[@id='BtnSubmit']")
	   private   WebElement employeesubmit;

	 

	 public void employee(String employename,String username, String employeepswd, String employeetype) throws InterruptedException 	
		
		{
		
		 employeename.sendKeys(employename);
		
		Thread.sleep(1000);
		
		employeeusername.sendKeys(username);
		
		Thread.sleep(1000);
		

		Select Role = new Select(employeepassword);
		
		Role.selectByVisibleText(employeepswd);
		
		Thread.sleep(1000);
		

		Select branch = new Select(employeebranch);
		
		branch.selectByVisibleText(employeetype);
		
		Thread.sleep(1000);
		

		employeesubmit.click();
		
		Thread.sleep(5000);
		
		
		}
		


	
}
