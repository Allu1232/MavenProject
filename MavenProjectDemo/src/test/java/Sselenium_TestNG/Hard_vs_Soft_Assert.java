package Sselenium_TestNG;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Hard_vs_Soft_Assert {
	//@Test
	void test_hardassertions()
	{
	System.out.println("testign.....");
	System.out.println("testign.....");
	Assert.assertEquals (1, 2); //hard assertion
	System.out.println("testing....");
	System.out.println("testing....");
	}
	void test_softassertion()
	{
	System.out.println("testign.....");
	System.out.println("testign.....");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(1, 2); //hard assertion
	System.out.println("testing....");
	System.out.println("testing....");
	sa.assertAll();//mandatory
	}
}
