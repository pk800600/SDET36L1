package org.practice;

import org.testng.annotations.Test;

public class Practice3Test {

	@Test
	public void m1Test()
	{
		System.out.println("Running test1");
		System.out.println("hii");
		System.out.println("hello");
	}
	
	@Test
	public void m2Test()
	{
		String BROWSER= System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println("Browser====="+BROWSER);
		System.out.println("url ======="+URL);
		
		System.out.println("Running test2");
		
	}
	
	@Test
	public void m3Test()
	{
		System.out.println("Running test3");
	}
}
