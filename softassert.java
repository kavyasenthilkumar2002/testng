package project;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {


	    @Test
	    public void verifyData() {

	        SoftAssert soft = new SoftAssert();

	        System.out.println("Test Started");

	        soft.assertEquals("Hello", "Hello");
	        System.out.println("First Assertion Passed");

	        soft.assertEquals(10, 20);
	        System.out.println("Second Assertion Executed");

	        soft.assertTrue(true);

	        System.out.println("Test Ended");

	        soft.assertAll(); 
	    }
	}