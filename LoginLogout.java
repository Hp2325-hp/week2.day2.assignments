package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogout {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		// login page
				driver.get("https://acme-test.uipath.com/login");

				driver.manage().window().maximize();

				driver.findElement(By.xpath("//div[@class='controls']/input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");

				driver.findElement(By.xpath("//div[@class='controls']/input[@id='password']")).sendKeys("leaf@12");
				
				driver.findElement(By.xpath("//div[contains(@class,'control-group')]/following-sibling::button")).click();
				Thread.sleep(2000);
				
				String title=driver.getTitle();
				System.out.println(title);
				
				driver.findElement(By.xpath("//li/a[text()='Log Out']")).click();
				Thread.sleep(2000);
				
				driver.close();
				
	}

}
