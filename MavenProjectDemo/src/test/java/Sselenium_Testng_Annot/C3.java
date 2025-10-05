package Sselenium_Testng_Annot;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test(priority=2)

	void pqr()
	{
	System.out.println("this is pqr c3....");
}
	@BeforeSuite
	void bs()
	
	{
	System.out.println("this is before suite...");
	}
	@AfterSuite
	void as()
	
	{
	System.out.println("this is aftersuite...");
	}
}
