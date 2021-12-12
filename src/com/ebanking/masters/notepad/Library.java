package com.ebanking.masters.notepad;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Library 
{
	WebDriver driver;
	FileInputStream Fis;
	Properties pr;
	String expectedvalue, actualvalue;
	public void ranfordlaunch(String url) throws IOException
	
	
	{

		Fis = new FileInputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/properties/ebanking.properties");
		 pr = new Properties();
		 pr.load(Fis);
		
		expectedvalue = "Ranford Bank";
		 driver = new ChromeDriver();

		//syso(press the control and space) (system.out.println
		
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		// actual value taken from the RanfordBank home page as xpath
		
		 actualvalue = driver.findElement(By.xpath("//span[@class='style10']")).getText();
		
		
		
	if (expectedvalue.equalsIgnoreCase(actualvalue)) 
	{
		
		
		System.out.println("Ranford Bank application launched");
		
	}
	
	else
		
	{
		System.out.println("Ranford Bank application is failed");
	}
	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}
	

	public String adminlogin(String username, String password)
	{

		expectedvalue = "Welcome to Admin";
		
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(username);
		
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(password);
		
		driver.findElement(By.xpath(pr.getProperty("loginbutton"))).click();
		
		actualvalue = driver.findElement(By.xpath("//font[contains(text(),'Welcome')]")).getText();

		if (expectedvalue.equalsIgnoreCase(actualvalue)) 
		{
			
			
			System.out.println("admin login succesfully");
			return "Pass";
		}
		
		else
			
		{
			System.out.println("admin login is failed");
			return "fail";
		}

	}
	

	public String branchcreation(String brachname, String address, String pincode, String country, String state, String city) throws InterruptedException
	{
expectedvalue = "Sucessfully";
		
		driver.findElement(By.xpath(pr.getProperty("branches"))).click();
		
		driver.findElement(By.xpath(pr.getProperty("newbranch"))).click();
		
		driver.findElement(By.xpath(pr.getProperty("branchname"))).sendKeys(brachname);
		
		driver.findElement(By.xpath(pr.getProperty("address"))).sendKeys(address);

		driver.findElement(By.xpath(pr.getProperty("pincode"))).sendKeys(pincode);
		Thread.sleep(3000);
		
		Select ctry = new Select(driver.findElement(By.xpath(pr.getProperty("country"))));
		
		ctry.selectByVisibleText(country);
		
		Select stat = new Select(driver.findElement(By.xpath(pr.getProperty("state"))));
		
		stat.selectByVisibleText(state);
		
		Select cit = new Select(driver.findElement(By.xpath(pr.getProperty("city"))));
		
		cit.selectByVisibleText(city);
		
		driver.findElement(By.xpath(pr.getProperty("click1"))).click();
		
		Thread.sleep(1000);
		
		
		// condition statement for branch  	
	
		actualvalue = driver.switchTo().alert().getText();
		
		if (actualvalue.contains(expectedvalue)) 
		{
			System.out.println("branch created");
			
		}
		
		else
		{
			System.out.println("branch already exists");
			
		}
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
		
		Thread.sleep(1000);
		
		return actualvalue;
	}
	

	public String rolecreation(String rolename, String roledescription, String roletype) throws InterruptedException
	{
expectedvalue = "Sucessfully";
		
		
		driver.findElement(By.xpath(pr.getProperty("roles"))).click();
	
		driver.findElement(By.xpath(pr.getProperty("newrole"))).click();
		
		driver.findElement(By.xpath(pr.getProperty("rolename"))).sendKeys(rolename);
		
		driver.findElement(By.xpath(pr.getProperty("roledescription"))).sendKeys(roledescription);

		Select Roletype = new Select(driver.findElement(By.xpath(pr.getProperty("roletype"))));
		
		Roletype.selectByVisibleText(roletype);
		
		driver.findElement(By.xpath(pr.getProperty("click2"))).click();
		
		Thread.sleep(1000);
		

	// condition statement for roles 	
		actualvalue = driver.switchTo().alert().getText();
		
		if (actualvalue.contains(expectedvalue)) 
		{
			System.out.println("role created");
			
		}
		
		else
		{
			System.out.println("role already exists");
		}
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
		
		Thread.sleep(1000);
		return actualvalue;
	}
	

	public String employeecreation(String employeename, String employeepwd, String employeetype, String employeenumber ) throws InterruptedException
	{

		driver.findElement(By.xpath(pr.getProperty("employee"))).click();
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath(pr.getProperty("newemployee"))).click();
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath(pr.getProperty("employeename"))).sendKeys(employeename);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(pr.getProperty("employeepwd"))).sendKeys(employeepwd);
		
		Thread.sleep(3000);
		

		Select Role = new Select(driver.findElement(By.xpath(pr.getProperty("employeetype"))));
		
		Role.selectByVisibleText(employeetype);
		
		Thread.sleep(1000);
		

		Select branch = new Select(driver.findElement(By.xpath(pr.getProperty("employeenumber"))));
		
		branch.selectByVisibleText(employeenumber);
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath(pr.getProperty("employeesubmit"))).click();
		
		Thread.sleep(5000);
		
		
		// condition statement for employees
		

		actualvalue = driver.switchTo().alert().getText();
		
		if (actualvalue.contains(expectedvalue)) 
		{
			System.out.println("Employee created");
			
		}
		
		else
		{
			System.out.println("Employee already exists");
		}
		
	
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
		
		Thread.sleep(1000);

		return actualvalue;
	}
	

	public String logout() throws InterruptedException
	{

		driver.findElement(By.xpath(pr.getProperty("logout"))).click();
		
		Thread.sleep(1000);
		
		return "logout succesfully";
	}
	

	public String bankerlogin(String branchtype, String branchusername, String branchpwd) throws InterruptedException
	{
		
		expectedvalue = "Welcome to 1 Branch";

		Select branchname = new Select(driver.findElement(By.xpath(pr.getProperty("bankertype"))));
		
		branchname.selectByVisibleText(branchtype);
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(pr.getProperty("branchusername"))).sendKeys(branchusername);
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath(pr.getProperty("branchpwd"))).sendKeys(branchpwd);
		
		Thread.sleep(1000);
		
		

		driver.findElement(By.xpath(pr.getProperty("branchclick"))).click();
		
		Thread.sleep(3000);
		
		actualvalue = driver.findElement(By.xpath("//span[@id='Label1']")).getText();

		if (expectedvalue.equalsIgnoreCase(actualvalue)) 
		{
			
			
			System.out.println("banker login succesfully");
			
		}
		
		else
			
		{
			System.out.println("banker login is failed");
		}
		
		return "banker login succesfully";
		
	}
	public void closebrowser() 
	{

		driver.quit();
		
		
	}


	
	
	

}
