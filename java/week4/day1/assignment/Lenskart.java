package week4.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Lenskart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement computerGlasses = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/div[2]/a"));
		WebElement premiumRange = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/a/div/div/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(computerGlasses).pause(2000).click(premiumRange).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"categoryPage\"]/div[4]/div[1]/div/div/div[3]/div/ul/li[2]/div/label/span/img")).click();
		WebElement frameColor = driver.findElement(By.xpath("//*[@id='categoryPage']/div[4]/div[1]/div/div/div[4]/div/ul/li[1]/div/label/span"));
		frameColor.click();
		String strFrameColor = frameColor.getText().replaceAll("\\D", "");
		int countFrameColor = Integer.parseInt(strFrameColor);
		System.out.println("Frame Color Count :" + countFrameColor);
		
	}

}
