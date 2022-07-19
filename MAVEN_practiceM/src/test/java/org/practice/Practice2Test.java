package org.practice;

import org.testng.annotations.Test;

public class Practice2Test {

	@Test
	public void displayTest()
	{
		String url=System.getProperty("URL");
		String browser=System.getProperty("BROWSER");
		String username=System.getProperty("USERNAME");
		String password=System.getProperty("PASSWORD");
		
		System.out.println("display method is executing");
		System.out.println("url======>"+url);
		System.out.println("Browser=====>"+browser);
		System.out.println("UserName====>"+username);
		System.out.println("Password====>"+password);
		
	}
	
	@Test
	public void m2Test()
	{
		System.out.println("m2 method is executing");
		System.out.println("m2 method is running and executing");
		System.out.println("m2 method is accepting");
	}
}
