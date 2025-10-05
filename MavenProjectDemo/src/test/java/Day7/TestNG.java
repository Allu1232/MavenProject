package Day7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeMethod
	void login()
{
		System.out.println("This Login");
		}
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	
	@Test
	void search() {
		System.out.println("search");
	}
	@Test(priority=2)
	void advancedSearch() {
		System.out.println("advanced Search");
	}
}
