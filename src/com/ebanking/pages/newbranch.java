package com.ebanking.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class newbranch 

{
	@FindBy(xpath = "//input[@id='txtbName']")
	private WebElement branchname;

   @FindBy(xpath="//input[@id='txtAdd1']")
   private   WebElement address;
   
   @FindBy(xpath = "//input[@id='txtZip']")
	private WebElement pincode;

  @FindBy(xpath="//select[@id='lst_counrtyU']")
  private   WebElement country;
  @FindBy(xpath = "//select[@id='lst_stateI']")
	private WebElement state;

 @FindBy(xpath="//select[@id='lst_cityI']")
 private   WebElement city;
 
 @FindBy(xpath = "//input[@id='btn_insert']")
 private WebElement click1;

 
 
 
	public void branchname(String bname, String adress, String pincoode, String contry, String sttate, String City) throws InterruptedException 	
	
	{
			

	
		branchname.sendKeys(bname);
	
		address.sendKeys(adress);

		pincode.sendKeys(pincoode);
	
	Select ctry = new Select(country);
	
	ctry.selectByVisibleText(contry);
	
	Select state1 = new Select(state);
	
	state1.selectByVisibleText(sttate);
	
	Select city1 = new Select(city);
	
	city1.selectByVisibleText(City);
	
	click1.click();
	
	Thread.sleep(1000);

	
	}
}
