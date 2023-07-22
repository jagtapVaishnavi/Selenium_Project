package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneAssignment1 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	//To launch the chrome browser
	WebDriver driver = new ChromeDriver();
	
	//To maximize the window
	driver.manage().window().maximize();
	
	//To apply the implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//To launch the web application
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	driver.findElement(By.xpath("//a[text()='Coins ']")).click();
	
	driver.findElement(By.xpath("//span[text()='1 gram']")).click();
	
	
	//To close the browser
	driver.close();
}
}
