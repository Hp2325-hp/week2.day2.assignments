package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtml {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//image click
		driver.findElement(By.xpath("//label[contains(text(),'Click on this image to go home page')]/following-sibling::img")).click();
		
		driver.navigate().back();
		
		//broken image or not
		WebElement findElement = driver.findElement(By.xpath("//label[contains(text(),'Am I Broken Image?')]/following-sibling::img"));
		
		String attribute = findElement.getAttribute("naturalWidth");
		
		if (attribute.equals("0"))
		{
			System.out.println("Image is Broken");
			//driver.navigate().back();
		}
		else {
			System.out.println("Image is not broken");
			//driver.navigate().back();
		}
		
		//using keyboard or mouse
		driver.findElement(By.xpath("//label[contains(text(),'Click me using Keyboard or Mouse')]/following-sibling::img")).click();

	}

}
