package com.crm.Vtiger;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups = "smoke")
	public void aTest()
	{
		System.out.println("======A====");
	}
	@Test(groups = "regression")
	public void bTest()
	{
		System.out.println("======B====");
	}
}
