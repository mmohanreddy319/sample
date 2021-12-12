package com.ebanking.scripts;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.Platform;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ebanking.pages.Admin;
import com.ebanking.pages.Brancheshomepage;
import com.ebanking.pages.Ranfordpage;
import com.ebanking.pages.newbranch;




public class SGrid 
{
   DesiredCapabilities cap=null;
   @Parameters("browsers")

   @Test
	   public void Gd(String Br) throws MalformedURLException, InterruptedException
	  
   {
	   
  
		   if (Br.equalsIgnoreCase("firefox"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("firefox");
			   cap.setPlatform(Platform.MAC);
			    	
	    	}
		   
		   else if (Br.equalsIgnoreCase("chrome"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("chrome");
			   cap.setPlatform(Platform.ANY);
			   
		}
	   
	

	   RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.40:4444/wd/hub"),cap);
	   
	    driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2/home.aspx");
		
		  Ranfordpage login = PageFactory.initElements(driver, Ranfordpage.class);
		  login.usernme();
		  login.pswd();
		  login.lgnbtn();
		
		Admin admin = PageFactory.initElements(driver, Admin.class);

		admin.branches1();
		
		Brancheshomepage newbranch = PageFactory.initElements(driver, Brancheshomepage.class);

		newbranch.Newbranch();
		
		newbranch branch = PageFactory.initElements(driver, newbranch.class);

		branch.branchname("srname", "29 north anne street, old distlery", "12344", "INDIA", "GOA","GOA");
	
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
   }
}
