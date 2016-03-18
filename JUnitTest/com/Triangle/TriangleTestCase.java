package com.Triangle;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.Triangle.TriangleTest;

@RunWith(Parameterized.class)
public class TriangleTestCase {
	private String expected = null;
	private int a;
	private int b;
	private int c;
	private TriangleTest triangle = null;

	public TriangleTestCase(int a, int b, int c, String expected) {
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
				{-1,1,1,"1st Not Positive"},{0,1,1,"1st Not Positive"},
				{-1,1,1,"1st Not Positive"},{1,0,1,"2nd Not Positive"},
				{1,1,-1,"3rd Not Positive"},{1,1,0,"3rd Not Positive"},
				{-1,-1,1,"1st 2nd Not Positive"},{-1,1,-1,"1st 3rd Not Positive"},{1,-1,-1,"2nd 3rd Not Positive"},
				{-1,-1,-1,"1st 2nd 3rd Not Positive"},
				{1,1,2,"Not Triangle"},{1,2,1,"Not Triangle"},{2,1,1,"Not Triangle"},
				{1,1,3,"Not Triangle"},{1,3,1,"Not Triangle"},{3,1,1,"Not Triangle"},
				{3,4,5,"Scalene"},{6,8,10,"Scalene"},
				{2,2,3,"Isosceles"},{3,2,2,"Isosceles"},{2,3,2,"Isosceles"},
				{3,3,3,"Equilateral"}
				});
	}

	@Test
	public void testAdd() {
		assertEquals(this.expected, triangle.test(a, b, c));
	}
}