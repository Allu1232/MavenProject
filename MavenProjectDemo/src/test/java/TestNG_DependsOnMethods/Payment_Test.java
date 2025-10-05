package TestNG_DependsOnMethods;

import org.testng.annotations.Test;

public class Payment_Test {

	@Test(priority=1, groups={"sanity","regression"})

	void paymentinRupees()
	{
	System.out.println("payment in rupees....");
	}
	@Test(priority=2, groups={"sanity","regression"})
	
	void paymentinDollars()
	{
	System.out.println("payment in dollar....");
	}
}
