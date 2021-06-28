package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("ms" + Keys.TAB);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("mdu" + Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(3000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		List<String> trainList = new ArrayList<String>();
		for (int i = 1; i <= rowCount; i++) {
			String trainNames = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			trainList.add(trainNames);
		}
		Set<String> trainNamesSet = new LinkedHashSet<String>(trainList);
		if (trainList.size() != trainNamesSet.size()) {
			System.out.println("Then there is a dublicate name in the rain list");
		}

	}

}
