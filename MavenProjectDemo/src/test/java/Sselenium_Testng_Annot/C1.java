package Sselenium_Testng_Annot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	
	@Test(priority=1)
	void abc()
	{
	System.out.println("this is abc c1...");
	}
	@BeforeTest
	void bt()
	{
	System.out.println("This is before test method ..");
	}
	

}
