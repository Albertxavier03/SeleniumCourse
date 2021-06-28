package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to maximize the window:
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'findLeads')]")).click();
		driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[2]")).click();
		WebElement phoneCountry = driver.findElement(By.xpath("//input[@name = 'phoneCountryCode']"));
		phoneCountry.clear();
		phoneCountry.sendKeys("91");
		driver.findElement(By.xpath("//input[@name = 'phoneAreaCode']")).sendKeys("044");
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("9941453278");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		
		WebElement leadID1 = driver.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String textleadID1 = leadID1.getText();
		//System.out.println(textleadID1);
		leadID1.click();
	
		driver.findElement(By.xpath("//a[text()= 'Delete']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'findLeads')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class= 'x-panel-body x-panel-body-noheader x-panel-body-noborder'])[8]//input")).sendKeys(textleadID1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		WebElement recordDisplay = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div"));
		String dispalyedMessage = recordDisplay.getText();
		//System.out.println(dispalyedMessage);
		if (dispalyedMessage.equals("No records to display")) {
			System.out.println("The LeadID is deleted sucessfully..!");
			
		}
		else {
			System.out.println("The LeadID is not deleted sucessfully..");
		}
		driver.quit();
		
	}
}