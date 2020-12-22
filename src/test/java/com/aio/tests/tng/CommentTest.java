package com.aio.tests.tng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CommentTest {
	@Test(groups = "NUT-TC-1806" )

	public void testSoftAssertInOne() {

	SoftAssert softAssert = new SoftAssert(); 
	softAssert.assertEquals(2, 3, "Verify 2 === 3"); 
	softAssert.assertAll("End of story"); 
	}

	@Test(groups = "NUT-TC-1807")

	public void abc() {

	String abc = null;

	System.out.println(abc.split(",")); }
}
