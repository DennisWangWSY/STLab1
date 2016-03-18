package com.Triangle;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IsATriangleTest.class, IsEquilateralTest.class,
		IsIsoscelesTest.class, PositiveTest.class, TriangleTestCase.class })
public class AllTests {

}
