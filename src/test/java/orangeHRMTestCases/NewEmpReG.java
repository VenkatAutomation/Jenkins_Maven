package orangeHRMTestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Apputils;
import orangeHRMLibrary.AddEmployee;
import orangeHRMLibrary.AdminModuleUtils;

public class NewEmpReG extends AdminModuleUtils
{
	@Parameters({"fname","lname"})
	@Test
	public void addEmployee(String fname,String lname)
	{	
		AddEmployee ad = new AddEmployee();
		boolean res =ad.addEmp(fname, lname);
		
		Assert.assertTrue(res);		
	}
}
