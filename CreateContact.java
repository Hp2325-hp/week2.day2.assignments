package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// login page
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("democsr");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//div/a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Hari");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Prakash");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("HP");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("HP");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Supply chain");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Working in supply chain Management");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Hari@gmkail.com");
		
		WebElement we=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select s=new Select(we);
		
		s.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//div/a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("IMPORTANT NOTES");
		
		driver.findElement(By.xpath("//tr//input[@name='submitButton']")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		//driver.close();
		
		
	}

}
