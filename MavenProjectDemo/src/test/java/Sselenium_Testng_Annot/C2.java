package Sselenium_Testng_Annot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@Test(priority=2)

	void xyz()
	{
	System.out.println("this is xyz c2....");
}
	@AfterTest
	void at()
	
	{
	System.out.println("this is after test method...");
	}
}
