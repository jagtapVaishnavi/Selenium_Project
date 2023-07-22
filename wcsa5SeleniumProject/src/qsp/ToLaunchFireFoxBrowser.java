package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","./drivers/geckodrive.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}

