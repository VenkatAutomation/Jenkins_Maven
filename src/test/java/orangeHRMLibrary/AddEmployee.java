package orangeHRMLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Apputils;

public class AddEmployee extends Apputils
{
	
	
	public boolean addEmp(String fname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
		String empid = driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(empid);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
		
		List<WebElement> rows,cols;
		
		rows = table.findElements(By.tagName("tr"));
		boolean flag =false;
		for (int i = 1; i < rows.size(); i++)
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				flag = true;
			}
			
		}
		return flag;
		
		
	}
	
	
}
