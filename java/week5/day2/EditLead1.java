package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead1 extends BaseClass1 {

	@Test(dataProvider = "fetchEditData")
	public void runEditLead(String comp,String pNo) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(comp);
		driver.findElement(By.name("submitButton")).click();
	
}
	@DataProvider(name="fetchEditData")
	public String[][] sendData() throws IOException {
		
		ReadXcel xcel = new ReadXcel();
		String[][] xcelData = xcel.xcelData("Sheet2");
		
		return xcelData;
	}
}







