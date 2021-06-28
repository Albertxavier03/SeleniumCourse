package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement menFashion = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[2]"));
		actions.moveToElement(menFashion).pause(2000)
		.click(driver.findElement(By.xpath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span")))
		.perform();
		WebElement firstImage = driver.findElement(By.xpath("//section[@class= 'js-section clearfix dp-widget  dp-fired']//a"));
		actions.moveToElement(firstImage).pause(2000)
		.click(driver.findElement(By.xpath("(//div[@class = 'center quick-view-bar  btn btn-theme-secondary  '])[1]")))
		.perform();
		driver.close();
		
	}

}
