package com.ebanking.testng;

import org.testng.annotations.Test;

public class RoleNG extends Base
{


	@Test(priority = 1)
	public void Role() throws InterruptedException
	{
		
		test.role();
		
	}
}
