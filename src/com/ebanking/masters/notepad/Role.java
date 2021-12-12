package com.ebanking.masters.notepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ebanking.master.Library;

public class Role {

	public static void main(String[] args) throws InterruptedException, IOException{
		

	
			
	   Library lb = new Library();
		
		lb.ranfordlaunch("http://122.175.8.158/ranford2/");
		
		String admin = lb.adminlogin("Admin","Testing@");
		System.out.println(admin);
			
			//To get test data file path
			
			String Fpath="/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/testdata/rdata.txt";
			
			//To get Results file path
		

			String Rpath="/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/results/Results_rdata.txt";
			String SD;
			//To get test data file
			
			FileReader FR=new FileReader(Fpath);
			BufferedReader BR=new BufferedReader(FR);
			String Sread=BR.readLine();
			System.out.println(Sread);
			
			//write header line into results file
			
			FileWriter FW=new FileWriter(Rpath);
			BufferedWriter BW=new BufferedWriter(FW);
			BW.write(Sread);
			BW.newLine();
			
			//Multiple Iterations-----Loop
			
			//While loop
			
			while ((SD=BR.readLine())!=null) 
			{
				System.out.println(SD);
				
				//Split
				
				String SR[]=SD.split("###");
				
				      String Rname=SR[0];
				      String Rdesc=SR[1];
				      String Rtype=SR[2];
				    
				      
				      String Res=lb.rolecreation(Rname, Rdesc, Rtype);
				      System.out.println(Res);
				      
				      //Results
				      
				      BW.write(SD+"$$$$"+Res);
				      BW.newLine();
				      
			}
			
			BW.close();
			BR.close();
			}

}



