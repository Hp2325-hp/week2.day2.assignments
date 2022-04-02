package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtml {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Edit.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[@class='row']//input[@id='email']")).sendKeys("hp@mail.com");
	
	//append and tab key
	driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input")).sendKeys("added",Keys.TAB);
	
	//get default text entered
	String username=driver.findElement(By.xpath("//div[@class='row']//input[@name='username']")).getAttribute("Value");
	System.out.println(username);
	
	//clear
	driver.findElement(By.xpath("(//div[@class='row']//input[@name='username'])[2]")).clear();
	
	//find enable
	boolean enabled=driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]/following-sibling::input")).isEnabled();
	System.out.println(enabled);
	}
}
