package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.Homepage;
import testBase.BaseClass;



public class TC001_AccountRegistration extends BaseClass {
	
	
	@Test
	public void verify_account_registration()
	{
		logger.info("****TC001_AccountRegistration****");
			Homepage hp=new Homepage(driver);
			hp.clickMyAccount();
			hp.clickRegister();
			
			logger.info("****register****");
			AccountRegistration regpage=new AccountRegistration(driver);
			regpage.setFirstName(randomeString());
			regpage.setLastName(randomeString());
			regpage.setEmail(randomeString()+"@gmail.com"); // randomly generated the email
			regpage.setTelephone (randomeNumber());
			String password=randomeAlphaNumberic();
			regpage.setPassword (password);
			regpage.setConfirmPassword(password);
			regpage.setPrivacyPolicy();
			regpage.clickContinue();
			
			logger.info("Validating expected message..");
			String confmsg=regpage.getConfirmationMsg();
			Assert.assertEquals (confmsg, "Your Account Has Been Created!");
			}
	   catch(Exception e) {
		logger.error("Test failed..");
		logger.debug("Debug logs..");
		Assert.fail();
		}
			
           }

