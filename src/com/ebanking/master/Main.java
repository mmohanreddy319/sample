package com.ebanking.master;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		Library lb = new Library();
		
		lb.ranfordlaunch("http://122.175.8.158/ranford2/");
		
		String admin = lb.adminlogin("Admin","Testing@");
		System.out.println(admin);
		String branchcreation = lb.branchcreation("srname", "29 north anne street, old distlery", "12344", "INDIA", "GOA", "GOA");
		System.out.println(branchcreation);
		String rolecreation = lb.rolecreation("testingspecialist","testing the web application","E");
		System.out.println(rolecreation);
		String employeecreation = lb.employeecreation("sanjay","sanjay123","RAMBO123","1");
		System.out.println(employeecreation);
		String logout = lb.logout();
		System.out.println(logout);
		String bankerlogin = lb.bankerlogin("1","sanjay","sanjay123");
		System.out.println(bankerlogin);
		
		 lb.closebrowser();
	

		
		
	}

}
