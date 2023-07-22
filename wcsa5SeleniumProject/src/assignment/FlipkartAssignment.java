package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.name("q")).sendKeys("Hp Laptop");
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Brand']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='HP']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='HP Pavilion (2023) Intel Core i7 13th Gen - (16 GB/1 TB SSD/Windows 11 Home) 15-eg3036TU Thin and Ligh...']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
			Thread.sleep(2000);
		
		
		}
	}

