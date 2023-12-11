package com.testng;

import org.testng.annotations.Test;

public class GroupTestDemo {
	@Test(groups = {"red"})
	public void red1() {
		System.out.println("red1 ");
	}
	@Test(groups = {"red"})
	public void red2() {
		System.out.println("red2 ");
	}
	@Test(groups = {"red"})
	public void red3() {
		System.out.println("red3 ");
	}
	
	@Test(groups = {"green"})
	public void green1() {
		System.out.println("green1 ");
	}
	@Test(groups = {"green"})
	public void green2() {
		System.out.println("green2 ");
	}
	@Test(groups = {"green"})
	public void green3() {
		System.out.println("green3 ");
	}
	
	@Test(groups = {"blue"})
	public void blue1() {
		System.out.println("blue1 ");
	}
	@Test(groups = {"blue"})
	public void blue2() {
		System.out.println("blue ");
	}
	@Test(groups = {"blue"})
	public void blue3() {
		System.out.println("blue3 ");
	}
	
	@Test(groups = {"blue","green"})
	public void blue_green() {
		System.out.println("blue_green ");
	}
	@Test(groups = {"blue","red"})
	public void blue_red() {
		System.out.println("blue_red ");
	}
	@Test(groups = {"green","red"})
	public void green_red() {
		System.out.println("green_red ");
	}
	
}
