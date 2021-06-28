package week2.day1.assignment;

import java.awt.image.TileObserver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillingTheForm {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to maximize the window:
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		WebElement title = driver.findElement(By.xpath("//*[@id=\'form\']/h2"));
//		String pageTitle = title.getText();
//		System.out.print("The page Title is : " + pageTitle);
		
		String tilte = driver.getTitle();
		System.out.println("The Title name is :" + tilte);
		if (tilte.contains("TestLeaf Automation Platform")) {
			System.out.println("The Title is correct");
		}
		else {
			System.out.println("The Title is wrong");
		}
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// filling the detaisl:
// General Info:		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Albert");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Xavier");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Albert");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Xavier");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/3/89");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000 - USD");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("16");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("BSF1");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("abcd efg hij");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("123 dfsd 3254 fdgfdh");
		// drop down:
		WebElement sourse = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown1 = new Select(sourse);
		dropDown1.selectByVisibleText("Cold Call");
		
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown2 = new Select(marketingCampaign);
		dropDown2.selectByVisibleText("Automobile");
		
		WebElement preferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropDown3 = new Select(preferredCurrency);
		dropDown3.selectByValue("USD");
		
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown4 = new Select(industry);
		dropDown4.selectByVisibleText("Aerospace");
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown5 = new Select(ownership);
		dropDown5.selectByVisibleText("Sole Proprietorship");

		
		// wait for 5 secs:
		Thread.sleep(5000);
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div[2]/a[1]")).click();
		
		WebElement duplilateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		duplilateCompanyName.clear();
		duplilateCompanyName.sendKeys("Test Leaf - Chennai");
		
		// wait for 5 secs:
		Thread.sleep(5000);
		
		driver.findElement(By.name("submitButton")).click();
		
		// Verifying the Duplicate Company Name:
//		WebElement duplicateCompany = driver.findElement(By.id("viewLead_companyName_sp"));
//		String companyName = duplicateCompany.getText();
//		
//		System.out.println("");
//		System.out.println("Comapny Name : " + companyName);
		
		driver.findElement(By.linkText("Edit")).click();
		WebElement company = driver.findElement(By.id("updateLeadForm_companyName"));
		String companyVerification = company.getAttribute("value");
		System.out.println("Comapny Name" + companyVerification);
		if (companyVerification.contains("Test Leaf chennai")) {
			System.out.println("Verification is sucess");
		}
		else {
			System.out.println("Verification is sucess");
		}
		
		// wait for 10 secs:
				Thread.sleep(10000);
				
				driver.close();
	}

}
