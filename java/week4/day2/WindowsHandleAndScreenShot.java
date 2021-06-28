package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandleAndScreenShot {

	public static void main(String[] args) throws IOException {
			
//			1. Load https://www.irctc.co.in/nget/train-search
//			2. Close the alert
//			3. Click on FLIGHTS tab
//			4. Take the screenshot of the second window(FLIGHTS)
//			5. Close the Fisrt Window alone

		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class= 'btn btn-primary']")).click();
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> noOfWindows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(noOfWindows);
		for (String eachWindows : noOfWindows) {
			windowsList.add(eachWindows);
		}
		String newWindow = windowsList.get(1);
		driver.switchTo().window(newWindow);
		driver.findElement(By.xpath("(//button[@type = 'button'])[6]")).click();
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\Albert Temp\\Test_Leaf\\workspace\\selenium course\\SeleniumCourse\\target\\screenshot.png");
		FileUtils.copyFile(screenshot, target);
		driver.close();
	}
}
