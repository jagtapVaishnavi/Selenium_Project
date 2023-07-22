package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Vaishnavi");
		driver.findElement(By.id("pass")).sendKeys("Vaishnavi@123");
		driver.findElement(By.id("u_0_5_NA")).click();
		
		//driver.getTagName();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
