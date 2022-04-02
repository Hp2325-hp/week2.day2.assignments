package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		
		driver.findElement(By.xpath("//div/a[contains(@data-testid,'open-registration-form-button')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Hari"); //xpath
		
		//p->c
		driver.findElement(By.xpath("//div[contains(@class,'uiStickyPlaceholderInput')]/input[@name='lastname']")).sendKeys("Prak");
		
		//ES->YS
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("8080808080");
		
		//GP-GC
		driver.findElement(By.xpath("//div[@class='_5dbb']//input[@id='password_step_input']")).sendKeys("Password");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select ds=new Select(day);
		Select ms=new Select(month);
		Select ys=new Select(year);
		
		ds.selectByVisibleText("23");
		ms.selectByVisibleText("Apr");
		ys.selectByValue("1999");
		
		driver.findElement(By.xpath("//span/input[@name='sex' and @value='2']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
