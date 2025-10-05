package Sselenium_TestNG;

import org.testng.Assert;

public class Hard_Assertions {
	void test()
	{
	//Assert.assertEquals("xyz", "xyz");
	//Assert.assertEquals (123,345);
	//Assert.assertEquals("abc",123);
	//Assert.assertEquals("123",123);
	//Assert.assertNotEquals (123,123); // failed
	//Assert.assertNotEquals(123,345); //passed
	Assert.assertTrue(true); //pass
	//Assert.assertTrue(false); //failed
	Assert.assertTrue(1==2);
	Assert.fail();
	}
}
