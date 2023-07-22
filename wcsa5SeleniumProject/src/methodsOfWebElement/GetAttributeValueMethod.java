package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValueMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
	   WebElement AttributeValue = driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-l')]"));
	   String classValue = AttributeValue.getAttribute("class");
	   System.out.println(classValue);
	   
	   Thread.sleep(2000);
	   driver.close();
}
}