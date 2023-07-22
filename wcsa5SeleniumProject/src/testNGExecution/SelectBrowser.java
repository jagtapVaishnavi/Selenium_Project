package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;
  @Test
  @Parameters({"browser","URL" ,"Vusername","Vpassword"})
  public void chromeMethod(String browservalue ,String URL ,String pass ,String usn) {
	  
	  if(browservalue.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(URL);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("LoginButton")).click();
	  driver.quit();
	  
	  }
	  else if(browservalue.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		  
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(URL);
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("LoginButton")).click();
	      driver.quit();
	  }
  }
}
