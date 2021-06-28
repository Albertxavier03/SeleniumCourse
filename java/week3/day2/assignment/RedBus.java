package week3.day2.assignment;


import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//RedBus:


//10.Choose only Sleeper Bus
//11.Print the number of search results
//12.Choose also AC buses
//13.Print the number of search results

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to maximize the window:
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		driver.findElement(By.id("src")).sendKeys("c");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//ul[@class='autoFill']//li)[2]")).click();
		driver.findElement(By.id("dest")).sendKeys("Salem");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//ul[@class='autoFill']//li)[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[4]")).click();
		driver.findElement(By.id("search_btn")).click();
		
		String totalBus = driver.findElement(By.xpath("//span[@class = 'f-bold busFound']")).getText();
		//System.out.println(totalBus);
		String total = totalBus.replaceAll("\\D", "");
		//System.out.println(total);
		int totalSearchBus = Integer.parseInt(total);
		System.out.println("The number of search results : " + totalSearchBus);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[2]/label[1]")).click();
		
		String sleeperBus = driver.findElement(By.xpath("//span[@class = 'f-bold busFound']")).getText();
		String total2 = sleeperBus.replaceAll("\\D", "");
		//System.out.println(total);
		int totalSleeperBus = Integer.parseInt(total2);
		System.out.println("The number of Sleeper Bus in search result : " + totalSleeperBus);
		
		driver.findElement(By.xpath("//label[@for= 'bt_AC'][@class = 'custom-checkbox']")).click();
		
		String acBusAlso = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]/span[1]/span")).getText();
		String total3 = acBusAlso.replaceAll("\\D", "");
		//System.out.println(total);
		int totalAcBusAlso = Integer.parseInt(total3);
		System.out.println("The number of Sleeper Bus with AC in search result : " + totalAcBusAlso);
		

	}

}
