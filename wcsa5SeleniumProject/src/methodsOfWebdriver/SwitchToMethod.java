package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://www.google.co.in/");
	
	driver.switchTo().activeElement().sendKeys("Vaishnavii");
	
	Thread.sleep(2000);
	
	driver.close();
}
}
