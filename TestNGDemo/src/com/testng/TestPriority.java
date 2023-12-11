package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPriority {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@Test(priority = 2)
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test(priority = 0)
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test(priority = 1)
	public void test3()
	{
		System.out.println("Test 3");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
}
