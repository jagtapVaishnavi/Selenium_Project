package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 //To launch the browser
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jagtapv692@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@2019026543");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	Thread.sleep(2000);
	
	
	driver.close();
	 
}
}
