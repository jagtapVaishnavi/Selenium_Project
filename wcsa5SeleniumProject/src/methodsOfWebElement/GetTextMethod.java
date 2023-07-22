package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Vaishnavi");
		driver.findElement(By.id("pass")).sendKeys("Vaishnavi@123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		String elementValue = loginButton.getText();
		System.out.println(elementValue);
		
		Thread.sleep(2000);
		driver.close();
	}
}
