package com.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArithmeticTest {

	private int fno;
	private int sno;
	private int expectedResult;
	private Arithmetic arithmetic;
	
	public ArithmeticTest(int fno, int sno, int expectedResult) {
		super();
		this.fno = fno;
		this.sno = sno;
		this.expectedResult = expectedResult;
	}
	@Before
	public void initializeObject() {
		arithmetic=new Arithmetic();
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{10,20,30},{51,52,109}});
	}
	@Test
	public void test()
	{
		System.out.println("Result "+expectedResult);
		assertEquals(expectedResult, arithmetic.sum(fno, sno));
	}
}







