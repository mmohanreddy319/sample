package com.ebanking.testng;



import org.testng.annotations.Test;

public class BranchNG extends Base
{
	
	@Test(priority = 0)
	public void branch() throws InterruptedException
	{
		
		test.branchname();
		
	}
}
