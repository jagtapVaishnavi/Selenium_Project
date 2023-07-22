package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	//To launch the Microsoft edge Browser
	WebDriver driver = new EdgeDriver();
	
	//To maximize the browser
	driver.manage().window().maximize();
	
	//To give the delay of 2 sec.
	Thread.sleep(2000);
	
	//to close the browser
	driver.close();
}
}
