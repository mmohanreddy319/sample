package com.ebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Admin 
{
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='adminflow.aspx']//img")
	private WebElement home;
	
	@FindBy(xpath = "//a[@href='admin_banker_master.aspx']//img")
	private WebElement Branches1;
	
	@FindBy(xpath = "//img[@src='images/Branches_but.jpg']")
	private WebElement Branches2;
	
   @FindBy(xpath="//a[@href='Admin_Roles_details.aspx']//img")
   private   WebElement Roles;
   
   @FindBy(xpath="//a[@href='Admin_Roles_details.aspx']//img")
   private   WebElement Roles1;


   @FindBy(xpath = "//a[@href='userdetails.aspx']//img")
   private WebElement Users;

   @FindBy(xpath = "//a[@href='Admin_Emp_details.aspx']//img")
   private WebElement Employees;

   @FindBy(xpath = "//a[@href='Admin_Emp_details.aspx']//img")
   private WebElement Employees1;
   
   @FindBy(xpath = "//a[@href='home.aspx']//img")
   private WebElement logout;

 
  public void Home() 

   {
   	home.click();

   }   
   
public void branches() 

{

	Branches1.click();
	
}

public void branches1() 

{

	Branches2.click();
	
}
	
public void role() 
	
{
		
	Roles.click();			
	
}

public void role1() 

{
		
	Roles1.click();			
	
}	 


public  void user()

{

	Users.click();


}
public  void employees() throws InterruptedException
{
	
	Employees.click();
	   
	    }

public  void employees1() throws InterruptedException
{
	
	Employees1.click();
	   
	    }
	
	
public  void Logout() throws InterruptedException

{
	
	logout.click();

	
}

}
