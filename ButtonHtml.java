package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHtml {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click
		driver.findElement(By.id("home")).click();
		
		driver.navigate().back();
		
		//position
		System.out.println( driver.findElement(By.id("position")).getLocation());
		
		//color
		System.out.println( driver.findElement(By.id("color")).getCssValue("background-color"));

		//size
		System.out.println( driver.findElement(By.id("size")).getSize());
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
