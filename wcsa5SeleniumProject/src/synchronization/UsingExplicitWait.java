package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // launch Browser

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.get("https://www.shoppersstack.com/");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Nehru jacket']"))).click();
		//driver.findElement(By.xpath("//img[@alt='HOODIES']")).click();
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
	
		Thread.sleep(2000);
		
		driver.close();
        
	}
}
