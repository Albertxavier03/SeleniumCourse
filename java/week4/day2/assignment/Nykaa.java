package week4.day2.assignment;

import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Albert Temp\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String oldWindows = driver.getWindowHandle();
		
		WebElement brands = driver.findElement(By.xpath("//*[@id='headerMenu']/div[2]/ul[2]/li/a"));
		WebElement popular = driver.findElement(By.xpath("//*[@id='headerMenu']/div[2]/ul[2]/li/ul/li/section[2]/div[1]/a[1]"));
		WebElement orealParis = driver.findElement(By.xpath("//*[@id='brandCont_Popular']/ul/li[5]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(brands).moveToElement(popular).moveToElement(orealParis).click().perform();
		
		Set<String> noOfWindows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(noOfWindows);
		for (String eachWindows : noOfWindows) {
			windowsList.add(eachWindows);
		}
		String newWindow = windowsList.get(1);
		driver.switchTo().window(newWindow);
		
		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris")) {
			System.out.println("The Title is Valid");
		}
		else {
			System.out.println("The Title is not Valid");
		}
		
		driver.findElement(By.xpath("//span[@title= 'POPULARITY']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//*[@id=\"listingContainer\"]/div[2]/div[2]/div/div[1]/div[2]/div/div/ul/li/div/div/ul/li/div/div/ul/li[1]/div/div[1]/label/div")).click();
		WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"sortComponent\"]/div[1]/div/ul/li"));
		String filter = filterElement.getText();
		if (filter.contains("Shampoo")) 
		{
			System.out.println("Filter is applied with Shampoo");
		}
		else {
			System.out.println("Filter is not applied with Shampoo");
		}
		
		driver.findElement(By.xpath("//*[@id=\"listingContainer\"]/div[3]/div/div/div[2]/div/div/div[13]/div/a")).click();
		
		Set<String> noOfWindows2 = driver.getWindowHandles();
		List<String> windowsList2 = new ArrayList<String>(noOfWindows2);
		String newWindow2 = windowsList2.get(2);
		driver.switchTo().window(newWindow2);
		
		driver.findElement(By.xpath("//*[@id=\"color-section\"]/div[2]/div/div/div/ul/li[1]/label/span")).click();
		WebElement priceElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div"));
		String price = priceElement.getText();
		System.out.println("The price is :" + price);
		
		driver.findElement(By.xpath("(//button[@class= 'combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  '])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class= 'AddBagIcon']")).click();
		Thread.sleep(3000);
		WebElement grantTotalElement = driver.findElement(By.xpath("//*[@id=\"headerWpr\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/div/div[3]/div[1]/div[4]/div[2]"));
		Thread.sleep(3000);
		String grantTotal = grantTotalElement.getText().replaceAll("\\D", "");
		int grantTotalAmount = Integer.parseInt(grantTotal);
		System.out.println("The Grant Total Is : "+ grantTotal);
		driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		Thread.sleep(3000);
		WebElement finalTotalElement = driver.findElement(By.xpath("(//div[@class= 'payment-details-tbl grand-total-cell prl20']//div)[2]"));
		String finalTotal = finalTotalElement.getText().replaceAll("\\D", "");
		int finalTotalAmount = Integer.parseInt(finalTotal);
		System.out.println("Final Total : " + finalTotal); 
		if (finalTotalAmount == grantTotalAmount ) {
			System.out.println("This grand total is same as the previous grand total ");
		}
		else {
			System.out.println("This grand total is not same as the previous grand total ");
		}
		driver.quit();
		
	}

}
