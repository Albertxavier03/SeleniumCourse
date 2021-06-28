package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'contactsMain')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'createContact')]")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Albert");
		driver.findElement(By.id("lastNameField")).sendKeys("Xavier");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Albert");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Xavier");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hai everyone");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("albert@gamil.com");
		
		WebElement stateProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdownSate = new Select(stateProvince);
		dropdownSate.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'updateContactForm')]")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Deleted the Description");
		driver.findElement(By.xpath("(//input[@name = 'submitButton'])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println("The Title of the current page is :" + title);
		driver.quit();

	}

}
