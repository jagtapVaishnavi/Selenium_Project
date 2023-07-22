package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void test3Method() throws InterruptedException {
	  System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.google.com/");
	  
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  Thread.sleep(2000);
	  driver.quit();
	  Reporter.log("This is a Test3 class",true);
  }
}

