package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//div/a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//div//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span/span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys("8080808080");
		
		driver.findElement(By.xpath("//td//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String firstIdLink=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).getText();//getAttribute("href");
		System.out.println(firstIdLink);
		//String firstId=firstIdLink.substring(firstIdLink.length()-5);
		//System.out.println(firstId);
		
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(firstIdLink);
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String result=driver.findElement(By.xpath("//div[contains(@class,'x-small-editor')]//div[@class='x-paging-info']")).getText();
		Thread.sleep(2000);
		
		System.out.println(result);
		
		if(result.equals("No records to display"))
			System.out.println(firstIdLink+" Id is deleted");
		else
			System.out.println("Id is not deleted");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}
