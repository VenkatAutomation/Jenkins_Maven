package orangeHRMLibrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AdminModuleUtils 
{
	
	public LoginPage lp;
	
	public static String uid = "Admin";
	public static String pwd = "Qedge123!@#";
	
	@BeforeTest
	public void login()
	{
		lp = new LoginPage();
		lp.login(uid, pwd);
	}
	
	@AfterTest
	public void logout()
	{
		lp.logout();
	}
	
}
