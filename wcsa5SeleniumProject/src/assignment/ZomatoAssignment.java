package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoAssignment {
 public static void main(String[] args) throws InterruptedException {
	//To upcast the browser
	 
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 //To launch the browser
	 
	 WebDriver driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.zomato.com/india");
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a[text()='Log in']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='sc-60vv3c-1 cKUBiH']")).sendKeys("9876543210");
	 Thread.sleep(2000);
	 driver.close();
}
}
