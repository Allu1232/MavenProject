package TestNG_DependsOnMethods;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority=1)

	void loginByEmail()
	{ System.out.println("This is login by email..");
	}
	@Test(priority=2, groups={"Sanity"})
	
	void loginByFacebook()
	{
	System.out.println("This is login by facebook..");
	}
	@Test(priority=3,  groups={"Sanity"})

	void loginBytwitter()
	{
	System.out.println("This is login by twittert..");
	}

}
