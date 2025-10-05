package Sselenium_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test

	void testTitle()
	{
	String exp_title="Opencart";
	String act_title="Openshot";
	//1)Conditional Method or Verification
	/*if(exp_title.equals(act_title))
	{
	System.out.println("test passed");
	}
	else
	{
	System.out.println("test failed");
	}*/
	//2)Assertions
	//Assert.assertEquals(exp_title, act_title);
	
	//3)Assertions with conditions
	if(exp_title.equals(act_title))
	{
	System.out.println("test passed");
	Assert.assertTrue(true);
	}
	else
	{
	System.out.println("test failed");
	Assert.assertTrue(false);
	}
	}
	
	
}
