package Sselenium_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/*TC1
1) Login --@BeforeMethod
2) Search ---> @Test
3) Logout ---@AfterMethod
4) Login
5) Adv search ---@Test
6) Logout*/

public class Annotations_Demo1 {
	@BeforeMethod
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
	@AfterMethod
	void logout()
	
	{
	System.out.println("this is logout...");
	}}
