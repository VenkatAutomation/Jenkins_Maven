package orangeHRMTestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Apputils;
import orangeHRMLibrary.LoginPage;

public class AdminLoginWithValidData extends Apputils
{
	
	@Parameters({"uid","pwd"})
	@Test
	public void loginWithValidData(String uid,String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		
		boolean res =lp.isAdminModuleDisplayed();
		
		Assert.assertTrue(res);
		
		lp.logout();
	}
}
