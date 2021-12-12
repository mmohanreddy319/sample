package com.ebanking.testng;

import org.testng.annotations.Test;

public class EmployeeNG extends Base
{
	@Test(priority = 2)
	public void employee() throws InterruptedException
	{
		
		test.employee();
		
	}

}
