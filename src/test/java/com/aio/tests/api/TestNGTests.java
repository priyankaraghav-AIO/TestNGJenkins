package com.aio.tests.api;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTests {

	/*
	 * @DataProvider(name = "testDataProvider") public Object[][] testDataProvider()
	 * { return new Object[][] { {"Nothing",37}, {"NUT-TC-33, NUT-TC-2",36},
	 * {"Nothing Again",35}, }; }
	 */

	/*
	 * @Test(dataProvider = "testDataProvider", groups = "ATP-TC-5") public void
	 * dataProviderTestDefGroupAndOneOverriden(String s1, Integer n2) { //Your test
	 * goes here System.out.println("Print"+ s1 +","+ n2); }
	 */

	/*
	 * @DataProvider(name = "testDataProvider") public Object[][] testDataProvider()
	 * { return new Object[][] { {37,37}, {36,37}, }; }
	 * 
	 * @Test(dataProvider = "testDataProvider", groups = "ATP-TC-5") public void
	 * dataProviderTest(Integer n1, Integer n2) { //Your test goes here
	 * Assert.assertEquals(n1, n2, "Verify " + n1 + " == " + n2); }
	 */

	@DataProvider(name = "testDataProvider2")

	public Object[][] testDataProvider2() {

		return new Object[][] {

				{ 37, 37, "" },
				{ 36, 35, "NUT-TC-1802,NUT-TC-1020" },
				{ 35, 33, "" }, };

	}

	@Test(dataProvider = "testDataProvider2")

	public void onlyOneTestAnnotated(Integer n2, Integer n1, String tcName) {
		Assert.assertEquals(n1, n2, "Verify " + n1 + " == " + n2);

	}
}
