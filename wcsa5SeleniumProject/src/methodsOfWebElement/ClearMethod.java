package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To launch the browser
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	WebElement usnTB=driver.findElement(By.name("username"));
	WebElement passTB = driver.findElement(By.name("password"));
	
	Thread.sleep(2000);
	usnTB.sendKeys("Vaishnavi");
	passTB.sendKeys("Vaishnavi@123");
	
	usnTB.clear();
	passTB.clear();
}
}
