package week5.day2;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead1 extends BaseClass1 {
	
	@Test(dataProvider = "fetchCreateData")
	public void runCreateLead (String comp,String fName,String lName, String phNo) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
}
	@DataProvider(name="fetchCreateData")
	public String[][] sendData() throws IOException {
		
		ReadXcel xcel = new ReadXcel();
		String[][] xcelData = xcel.xcelData("Sheet1");
		
		return xcelData;
	}
}






