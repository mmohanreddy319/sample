package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {



	public static void main(String[] args) throws InterruptedException, IOException {
		

		Library lb = new Library();
		
		lb.ranfordlaunch("http://122.175.8.158/ranford2/");
		
		String admin = lb.adminlogin("Admin","Testing@");
		System.out.println(admin);
		
			
			FileInputStream Fis=new FileInputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/testdata/employee.xlsx");
			
			//WorkBook
			
			XSSFWorkbook WB=new XSSFWorkbook(Fis);
			
			//Sheets
			
			XSSFSheet WS=WB.getSheet("esheet");
			
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
				
				XSSFCell WC3=WR.getCell(3);
					
				XSSFCell WC4=WR.createCell(4);
				

//cell values
				
				String employeename=WC.getStringCellValue();
				String username=WC1.getStringCellValue();
				
				String password=WC2.getStringCellValue();
				
				String employeetype=WC3.getStringCellValue();

				
				//library class
				String employeecreation = lb.employeecreation(employeename, username, password, employeetype);
				System.out.println(employeecreation);

				WC4.setCellValue(employeecreation);
	}
			
			//Results 
			

			
			
			FileOutputStream Fos=new FileOutputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/results/Results_employeecreation.xlsx");
			WB.write(Fos);
			WB.close();
	}
}
