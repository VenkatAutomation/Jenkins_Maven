package orangeHRMLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.Apputils;

public class AddUser extends Apputils
{
	public boolean addUser(String role,String Empname,String uname,String pword) throws Throwable
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		sel.selectByVisibleText(role);
		
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys(Empname);
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys(pword);
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys(pword);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Admin")).click();
		
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
		
		List<WebElement> rows,cols;
		
		rows = table.findElements(By.tagName("tr"));
		
		boolean flag = false;
		
		for (int i = 1; i < rows.size(); i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(2000);
			if (cols.get(1).getText().equalsIgnoreCase(uname)) 
			{
				flag = true;
			}
		}
		
		return flag;
	}
}
