package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Branch {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		Library lb = new Library();
		
		lb.ranfordlaunch("http://122.175.8.158/ranford2/");
		
		String admin = lb.adminlogin("Admin","Testing@");
		System.out.println(admin);
		
			
			FileInputStream Fis=new FileInputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/testdata/branch.xlsx");
			
			//WorkBook
			
			XSSFWorkbook WB=new XSSFWorkbook(Fis);
			
			//Sheets
			
			XSSFSheet WS=WB.getSheet("bsheet");
			
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
				
				XSSFCell WC4=WR.getCell(4);
				
				XSSFCell WC5=WR.getCell(5);
				
				XSSFCell WC6=WR.createCell(6);
				
		//cell values
				
				String branchname=WC.getStringCellValue();
				String address=WC1.getStringCellValue();
				String pincode=WC2.getStringCellValue();
				
				String country=WC3.getStringCellValue();
				String state=WC4.getStringCellValue();
				String city=WC5.getStringCellValue();
			
				
				//library class
				
				String branchcreation = lb.branchcreation(branchname, address, pincode, country, state, city);
				System.out.println(branchcreation);
		
				
				WC6.setCellValue(branchcreation);

			}
				//Results 
			

			
				
				FileOutputStream Fos=new FileOutputStream("/Users/madanmohanreddy/Documents/Automation /Ebanking/src/com/ebanking/results/Results_branchcreation.xlsx");
				WB.write(Fos);
				WB.close();
				
	}

}
