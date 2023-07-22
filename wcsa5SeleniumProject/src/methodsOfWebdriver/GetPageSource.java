package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(2000);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	
	Thread.sleep(2000);
	driver.close();
}
}
