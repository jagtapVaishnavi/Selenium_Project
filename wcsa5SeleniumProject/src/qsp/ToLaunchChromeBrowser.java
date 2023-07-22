package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 
	 //Object creation for browser specific class
	 WebDriver driver= new ChromeDriver();
	 //To maximize the window
	 driver.manage().window().maximize();
	 //To give the delay of 2 sec
	 Thread.sleep(2000);
	 //To close the particular browser
	 driver.close();
}
}
