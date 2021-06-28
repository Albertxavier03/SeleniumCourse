package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {

	public static void main(String[] args) {
		
//				Classroom:
//				=========
//				1. Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
//				2. click Try it button
//				3. Enter your name in the prompt alert
//				4. Click Ok in the alert
//				5. Verify the text below Try it button contains your name

		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Albert");
		alert.accept();
		String message = driver.findElement(By.xpath("//p[@id = 'demo']")).getText();
		if (message.contains("Albert")) {
			System.out.println("The message contains your Name");
		}
		else {
			System.out.println("The message dosen't contains your Name");
		}
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
