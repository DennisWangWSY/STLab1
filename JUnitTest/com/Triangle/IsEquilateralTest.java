package com.Triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.Triangle.Triangle;

@RunWith(Parameterized.class)
public class IsEquilateralTest {
	private String expected = null;
	private int a;
	private int b;
	private int c;
	private Triangle triangle = null;

	public IsEquilateralTest(int a, int b, int c, String expected) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}

	@Before
	public void setUp() {
		triangle = new Triangle();
	}

	@Parameters
	public static Collection<Object[]> getData() {
		return Arrays.asList(new Object[][] { 
				{ 3,3,3,"Passed" }, 
				{ 3,5,3,"Not Equilateral" },
				{ 4,1,3,"Not Equilateral" } 
				});
	}

	@Test
	public void testAdd() {
		assertEquals(this.expected, triangle.equilateralTest(a, b, c));
	}
}