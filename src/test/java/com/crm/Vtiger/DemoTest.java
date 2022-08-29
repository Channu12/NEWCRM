package com.crm.Vtiger;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups ="smoke")
	public void displayTest()
	{
		System.out.println("====Hi...====");
                System.out.println("====Helllo...====");
		System.out.println("====Hi...====");
                System.out.println("====Helllo...====");


	}
	@Test(groups ="regression")
	public void HloTest()
	{
		System.out.println("====Helllo...====");
	}
}
