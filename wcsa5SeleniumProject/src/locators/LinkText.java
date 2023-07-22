package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To launch the browser
	WebDriver driver = new ChromeDriver();
	//To maximize the browser
	driver.manage().window().maximize();
	//To Apply the implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//To launch the web Application
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
	
	//driver.findElement(By.linkText("Open the popup window")).click();
	driver.findElement(By.linkText("Open a popup window")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
