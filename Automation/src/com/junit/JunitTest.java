package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("BeforeClass Test");
	}
	@Before
	public void before()
	{
		System.out.println("Before Test");
	}
	@Test
	public void test1() {
		System.out.println("This is test1");
	}
	@Test
	@Ignore
	public void test2() {
		System.out.println("This is test2");
	}
	@After
	public void after()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("AfterClass Test");
	}
}
