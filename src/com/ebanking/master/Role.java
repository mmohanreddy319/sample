package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Role {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	Library lb = new Library();
		
		lb.ranfordlaunch("http://122.175.8.158/ranford2/");
		
		String admin = lb.adminlogin("Admin","Testing@");
		System.out.println(admin);
		
			
			FileInputStream Fis=new FileInputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/testdata/row.xlsx");
			
			//WorkBook
			
			XSSFWorkbook WB=new XSSFWorkbook(Fis);
			
			//Sheets
			
			XSSFSheet WS=WB.getSheet("Rdata");
			
			//Row count
			
			int Rcount=WS.getLastRowNum();
			System.out.println(Rcount);
			
			//Multiple Iterations----Loop
			
			for (int i=1;i<=Rcount;i++) 
			{
				//Rows
				
				XSSFRow WR=WS.getRow(i);
				
				XSSFCell WC=WR.getCell(0);
				XSSFCell WC1=WR.getCell(1);
				
				XSSFCell WC2=WR.getCell(2);
				
				XSSFCell WC3=WR.createCell(3);
				
			
				
				//cell values
				
		
				String Rname=WC.getStringCellValue();
				String Rdesc=WC1.getStringCellValue();
				String RType=WC2.getStringCellValue();
				
				
				//library class
				
				
				String Role=lb.rolecreation(Rname,Rdesc, RType);
				System.out.println(Role);
				
				
				
				
				 WC3.setCellValue(Role);

			}
				//Results 
			

			
				
				FileOutputStream Fos=new FileOutputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/results/Results_Rolecreation.xlsx");
				WB.write(Fos);
				WB.close();
				
		
	}

}
