package methodsOfWebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetPosition {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	Point p = new Point(500,400);
	driver.manage().window().setPosition(p);
	
	Thread.sleep(2000);
	driver.close();
	
	
}
}
