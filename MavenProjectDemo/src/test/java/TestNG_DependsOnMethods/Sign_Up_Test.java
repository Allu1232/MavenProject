package TestNG_DependsOnMethods;

import org.testng.annotations.Test;

public class Sign_Up_Test {
	@Test(priority=1,  groups={"regression"})

	void signupbyemail()
	{
	System.out.println("this is signup by email....");
	}
	@Test(priority=1)

	void signupbyfacebook()
	{
	System.out.println("this is signup by facebook....");
	}
	@Test(priority=1, groups={"regression"})
	
	void signupbytwitter()
	{
	System.out.println("this is signup by twitter....");
	}

}
