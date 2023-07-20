package orangeHRMTestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Apputils;
import orangeHRMLibrary.AddUser;
import orangeHRMLibrary.AdminModuleUtils;

public class NewUserReg extends AdminModuleUtils
{

	@Parameters({"role","empname","uname","pword"})
	@Test
	public void userRegTest(String role,String empname,String uname,String pword) throws Throwable
	{
		AddUser ad = new AddUser();
		boolean res =ad.addUser(role, empname, uname, pword);
		Assert.assertTrue(res);
		System.out.println("User Reg is passed");
		System.out.println("This is for CI");
	}
	
	
}
