package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetAssignment {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//To apply the implicit wait 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-1eoj8my']")).sendKeys("9876543210");
	Thread.sleep(2000);
	driver.close();
}
}
