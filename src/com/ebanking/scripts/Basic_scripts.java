package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Basic_scripts {

	public static void main(String[] args) throws InterruptedException 
	{
		//Press control space to get the options
		
		// expected value taken from the RanfordBank home page
		String expectedvalue = "Ranford Bank";
		WebDriver driver = new ChromeDriver();

		//syso(press the control and space) (system.out.println
		
		
		driver.get("http://122.175.8.158/ranford2/");
		
		driver.manage().window().maximize();
		
		
		// actual value taken from the RanfordBank home page as xpath
		
		String actualvalue = driver.findElement(By.xpath("//span[@class='style10']")).getText();
		
		// now give the if statement and check whether the actual and expected result is matching or not
		
		// here in the if open brakets we have mentioned that the ranford bank is equal to the actual value with the xpath
		
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
		
		expectedvalue = "Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		actualvalue = driver.findElement(By.xpath("//font[contains(text(),'Welcome')]")).getText();

		if (expectedvalue.equalsIgnoreCase(actualvalue)) 
		{
			
			
			System.out.println("admin login succesfully");
			
		}
		
		else
			
		{
			System.out.println("admin login is failed");
		}
		
		expectedvalue = "Sucessfully";
		
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		
		driver.findElement(By.xpath("//input[@id='BtnNewBR']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtbName']")).sendKeys("srname");
		
		driver.findElement(By.xpath("//input[@id='txtAdd1']")).sendKeys("29 north anne street, old distlery");

		driver.findElement(By.xpath("//input[@id='txtZip']")).sendKeys("12344");
		
		Select ctry = new Select(driver.findElement(By.xpath("//select[@id='lst_counrtyU']")));
		
		ctry.selectByVisibleText("INDIA");
		
		Select state = new Select(driver.findElement(By.xpath("//select[@id='lst_stateI']")));
		
		state.selectByVisibleText("GOA");
		
		Select city = new Select(driver.findElement(By.xpath("//select[@id='lst_cityI']")));
		
		city.selectByVisibleText("GOA");
		
		driver.findElement(By.xpath("//input[@id='btn_insert']")).click();
		
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
		
		expectedvalue = "Sucessfully";
		
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']//img")).click();
	
		driver.findElement(By.xpath("//input[@id='btnRoles']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtRname']")).sendKeys("testingspecialist");
		
		driver.findElement(By.xpath("//input[@id='txtRDesc']")).sendKeys("testing the web application");

		Select Roletype = new Select(driver.findElement(By.xpath("//select[@id='lstRtypeN']")));
		
		Roletype.selectByVisibleText("E");
		
		driver.findElement(By.xpath("//input[@id='btninsert']")).click();
		
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
		
		expectedvalue = "Sucessfully";

		driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='Admin_Emp_details.aspx']//img")).click();
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@id='BtnNew']")).click();
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@id='txtUname']")).sendKeys("sanjay");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='txtLpwd']")).sendKeys("sanjay123");
		
		Thread.sleep(1000);
		

		Select Role = new Select(driver.findElement(By.xpath("//select[@id='lst_Roles']")));
		
		Role.selectByVisibleText("RAMBO123");
		
		Thread.sleep(1000);
		

		Select branch = new Select(driver.findElement(By.xpath("//select[@id='lst_Branch']")));
		
		branch.selectByVisibleText("1");
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@id='BtnSubmit']")).click();
		
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
		

		
		driver.findElement(By.xpath("//a[@href='home.aspx']//img")).click();
		
		Thread.sleep(1000);
		
		expectedvalue = "Welcome to 1 Branch";

		Select branchname = new Select(driver.findElement(By.xpath("//select[@id='drlist']")));
		
		branchname.selectByVisibleText("1");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("sanjay");
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("sanjay123");
		
		Thread.sleep(1000);
		
		

		driver.findElement(By.xpath("//input[@id='login']")).click();
		
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
		
		driver.quit();
		
		
		
		
	}

}
