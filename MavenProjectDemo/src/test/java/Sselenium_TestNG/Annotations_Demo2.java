package Sselenium_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*TC2
1) Login --- @BeforeClass
2) Search ---@Test
3) Adv search---@Test 
 4) Logout---AfterClass*/

public class Annotations_Demo2 {
	@BeforeClass
	void login()
	{
	System.out.println("This is login..");
	}
	
	@Test(priority=1)
	void search()
	{
	System.out.println("this is search...");
	}
	@Test(priority=2)

	void advacedsearch()
	{
	System.out.println("this advanced search....");
}
	@AfterClass
	void logout()
	
	{
	System.out.println("this is logout...");
	}}
