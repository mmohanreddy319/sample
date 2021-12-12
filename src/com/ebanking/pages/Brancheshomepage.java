package com.ebanking.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Brancheshomepage 

{

	@FindBy(xpath = "//input[@id='BtnNewBR']")
	private WebElement newbranch;

   @FindBy(xpath="//a[@href='adminflow.aspx']//img")
   private   WebElement home;

  
public void Newbranch()
{
	newbranch.click();
}
public void Home()
{
	home.click();
}	
	

	}


