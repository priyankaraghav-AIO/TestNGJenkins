package com.aio.tests.tng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkippedTests2 {
	
    /*@Test(groups = {"ATP-TC-2","ATP-TC-5"},description = "is here")//1
    public void failedTest() {
        Assert.fail("Server didn't start");
    }  */

   /* @Test(groups ="NUT-TC-157", description = "Deprecated")//,dependsOnMethods = "failedTest")
    public void skippedTest() {
        System.out.println("This case is skipped test");
        
    } 
    
     @Test(groups = "NUT-TC-140",description = "Draft") 
    public void passedTest() {
        System.out.println("This is passed test");
        
    } 
     
     @Test(groups = "NUT-TC-179",description = "Under Review") 
     public void passedURTest() {
         System.out.println("This is passed test");
         
     } 
     
     @Test(groups = "NUT-TC-179xxx",description = "Invalid Case Key") 
     public void passedInvalidCaseKeyTest() {
         System.out.println("This is InvalidCaseKey test");
         
     } */

	/* @Test( groups = {"NUT-TC-1802","NUT-TC-1804"})
    public void method1() throws InterruptedException {
        System.out.println("Should update two cases");
       Thread.sleep(600);
    } 
  */
	 @Test( groups = {"NUT-TC-1802"})
	    public void methods1() throws InterruptedException {
	        System.out.println("Should update one cases");
	       Thread.sleep(600);
	    } 
	 @Test( groups = {"NUT-TC-1804"})
	    public void method1() throws InterruptedException {
	        System.out.println("Should update another cases");
	       Thread.sleep(600);
	    } 
 /* @Test
    public void method2() {
        System.out.println("Case in Cycle");
    } 

   @Test( groups = {"TCABCDEFG"})
  public void method3() {
      System.out.println("Case not in Cycle");
  } 
*/


}
