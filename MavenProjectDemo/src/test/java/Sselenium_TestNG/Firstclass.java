package Sselenium_TestNG;

import org.testng.annotations.Test;

public class Firstclass {
	@Test(priority=1)
	
	void openapp()
	{
	System.out.println("opening application...");
	}
	@Test(priority=2)

	void login()
	{
	System.out.println("Login to application.....");
	}
	@Test(priority=3)

	void logout()
	{
	System.out.println("Logout from application.....");
}
}