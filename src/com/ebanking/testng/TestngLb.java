package com.ebanking.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public  class TestngLb 
{
	WebDriver driver;
	
	
 

public void Rnaford() throws InterruptedException

	{
	
		 driver = new ChromeDriver();
		
		driver.get("http://122.175.8.158/ranford2/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		}
		
		
		public void admin() throws InterruptedException {
			
			
			driver.findElement(By.id("txtuId")).sendKeys("Admin");
			Thread.sleep(3000);
			
			driver.findElement(By.id("txtPword")).sendKeys("Testing@");
			
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			
		}
		public void branchname() throws InterruptedException 	
		
		{
				
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
		
	
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		}
		
		
	public void role() throws InterruptedException 	
	
	{
		
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
		
	
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
	}
	
		public void employee() throws InterruptedException 	
		
		{
		

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
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		}
		
		public void logout() throws InterruptedException 	
		{
			
		
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
		
		Thread.sleep(1000);
		

		
		driver.findElement(By.xpath("//a[@href='home.aspx']//img")).click();
		
		Thread.sleep(1000);
		
		}
		
		public void bank() throws InterruptedException 	
		{
		
		

		Select branchname = new Select(driver.findElement(By.xpath("//select[@id='drlist']")));
		
		branchname.selectByVisibleText("1");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("sanjay");
		
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("sanjay123");
		
		Thread.sleep(1000);
		
		

		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Thread.sleep(3000);
		
		
		}
		
	
		public void quit() throws InterruptedException 	
		{
		driver.quit();
		}

	
}
