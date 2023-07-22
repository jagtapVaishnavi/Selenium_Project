package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To launch the browser specific class upcast the browser into webdriver
	WebDriver driver= new ChromeDriver();
	//To maximize the browser
	driver.manage().window().maximize();
	//To apply the implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//To launch the web Application
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("Vaishnavi");
	driver.findElement(By.id("pass")).sendKeys("Vaishnavi@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(2000);
	driver.close();
			
}
}
