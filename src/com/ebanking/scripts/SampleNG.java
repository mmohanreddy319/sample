package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class SampleNG 
{
	WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void google() throws InterruptedException
	{
		driver.get("https://testzenlabs.ie/general-information-form/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("madan");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@placeholder='Your Middle Name']")).sendKeys("mohan");
			Thread.sleep(1000);
			
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}


}
