package com.Triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.Triangle.TriangleTest;

@RunWith(Parameterized.class)
public class IsIsoscelesTest {
	private String expected = null;
	private int a;
	private int b;
	private int c;
	private TriangleTest triangle = null;

	public IsIsoscelesTest(int a, int b, int c, String expected) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}

	@Before
	public void setUp() {
		triangle = new TriangleTest();
	}

	@Parameters
	public static Collection<Object[]> getData() {
		return Arrays.asList(new Object[][] { 
				{ 3,3,3,"Passed" }, 
				{ 3,5,3,"Passed" },
				{ 4,1,3,"Not Isosceles" } 
				});
	}

	@Test
	public void testAdd() {
		assertEquals(this.expected, triangle.isoscelesTest(a, b, c));
	}
}