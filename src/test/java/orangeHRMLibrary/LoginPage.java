package orangeHRMLibrary;

import org.openqa.selenium.By;

import Utils.Apputils;

public class LoginPage extends Apputils
{


	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}

	public boolean isAdminModuleDisplayed()
	{
		if (driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		} else 
		{
			return false;
		}
	}

	public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	public boolean isErrorMsgDisplayed()
	{
		if (driver.findElement(By.xpath("//span[text()='Invalid credentials']")).isDisplayed())
		{
			return true;
		} else 
		{
			return false;
		}
	}


}
