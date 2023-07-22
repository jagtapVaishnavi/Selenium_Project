package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To launch the browser
	WebDriver driver= new ChromeDriver();
	//To maximize the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//To launch the web application
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("monica geller",Keys.ENTER);
	
	driver.findElement(By.className("lNPNe")).click();
	
	Thread.sleep(2000);
	driver.close();
}
}
