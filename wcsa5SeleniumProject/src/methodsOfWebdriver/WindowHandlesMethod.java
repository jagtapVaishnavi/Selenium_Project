package methodsOfWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesMethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To Launch The browser
	WebDriver driver = new ChromeDriver();
	//To maximize the browsser
	driver.manage().window().maximize();
	//To apply the implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//to launch the web application
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
    String parentHandle = driver.getWindowHandle();
	System.out.println("Address of the parent window"+ parentHandle);
	
	// launch the child window
    driver.findElement(By.partialLinkText("Open a popup window")).click();
	Thread.sleep(2000);
	// get the handle or address of child window only
    Set<String> allHandles = driver.getWindowHandles();
	// Read addresses by using looping statment
	for(String wh:allHandles)
	{
    System.out.println(wh);
	}
	Thread.sleep(2000);
	//To close the all browsers
	driver.quit();
		      
}
}
