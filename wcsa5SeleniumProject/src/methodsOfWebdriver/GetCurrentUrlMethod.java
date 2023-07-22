package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.selenium.dev/");
	
	Thread.sleep(2000);
	String currentUrl= driver.getCurrentUrl();
	System.out.println(currentUrl);
	Thread.sleep(2000);
	driver.close();
}
}
