package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
//16998
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		// login page
				driver.get("http://leaftaps.com/opentaps/control/login");

				driver.manage().window().maximize();

				driver.findElement(By.id("username")).sendKeys("democsr");

				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div/a[text()='Leads']")).click();
				
				driver.findElement(By.xpath("//div//a[text()='Find Leads']")).click();Thread.sleep(2000);
				
				driver.findElement(By.xpath("//em[@class='x-tab-left']//span[text()='Email']")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("hari@gmail.com");
				
				driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				
				String OFirstName=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a")).getText();
				System.out.println(OFirstName);
				
				String FirstId=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).getText();
				System.out.println(FirstId);
				
				driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']")).click();
				Thread.sleep(2000);
				
				//Title verify
				String title=driver.getTitle();
				System.out.println(title);
				
				//Click Create Lead
				driver.findElement(By.xpath("//td/input[@value='Create Lead']")).click();
				Thread.sleep(2000);
				
				//Capture name of Duplicate
				String DFirstname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
				System.out.println(DFirstname);
				
				if(OFirstName.equals(DFirstname))
					System.out.println("Both are same");
				
				else
					System.out.println("Both are not same");
				
				Thread.sleep(4000);
				driver.close();
				
	}

}
