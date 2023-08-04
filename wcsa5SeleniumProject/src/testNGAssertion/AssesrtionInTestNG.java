package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssesrtionInTestNG {
@Test
public void verificationMethod() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	
	
	//Non Critical Feature
	 String actualTitle =driver.getTitle();
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(driver.getTitle(), actualTitle);
	 driver.findElement(By.name("username")).sendKeys("admin");
   	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 System.out.println("Title matched Test Case is passed!!");
	 sa.assertAll();
	 
	 
	 //critical feature 
	 if(driver.getTitle().equalsIgnoreCase("tvdcnmnfkjsfj"))	
	    {
			System.out.println("Title matched Test Case is passed!!");
		}
			else
			{
		    System.out.println("Title not matched Test case is Failed");
		}
	 
	 String actualTitleOfHomePage = driver.getTitle();
	 Assert.assertEquals(driver.getTitle(),"Vaishnavi");
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Logout")).click();
}
}
