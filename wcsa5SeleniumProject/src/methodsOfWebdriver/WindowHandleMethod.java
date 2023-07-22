package methodsOfWebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleMethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To Launch the browser
	WebDriver driver = new ChromeDriver();
	//To maximize the browser
	driver.manage().window().maximize();
	//To Apply the implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//To launch the web Application
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
	//To handle the parent window
	String parentHandle = driver.getWindowHandle();
	System.out.println(parentHandle);
	Thread.sleep(2000);
	driver.close();
	
	
}
}
