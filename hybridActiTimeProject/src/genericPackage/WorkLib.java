package genericPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest{
	
	private WebElement src;

	//To handle the Alert Pop-up
	public void acceptAlertPopUp() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlertPopUp() {
		driver.switchTo().alert().dismiss();
	}
    
	
	
	//To handle the Confirmation Pop-Up
	public void acceptConfirmationPopUp() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissConfirmationPopUp() {
		driver.switchTo().alert().dismiss();
	}
	
	//To Handle The Frame
	public void handleFrameByUsingIndex(int Index) {
		driver.switchTo().frame(Index);
	}
	
	public void handleFrameByUsingStringNameOrId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void handleFrameByUsingElement(WebElement FrameEle) {
		driver.switchTo().frame(FrameEle);
	}
	public void switchToMainPage() {
		driver.switchTo().defaultContent();
	}
	 public void switchToParentPage() {
		 driver.switchTo().parentFrame();
	 }
	 
	 //To handle the Mouse Actions
	 
	 public void mouseHoverMethod(WebElement target) {
		 Actions act = new Actions(driver);
		 act.moveToElement(target).perform();
	 }
	 
	 public void rightClickMethod(WebElement target) {
		 Actions act = new Actions(driver);
		 act.contextClick(target).perform();
	 }
	 
	 public void leftClickMethod(WebElement target) {
		 Actions act = new Actions(driver);
		 act.moveToElement(target).perform();
	 }
	 
	 public void doubleClickMethod(WebElement target) {
		 Actions act = new Actions(driver);
		 act.doubleClick(target).perform();
	 }
	 
	 public void dragAnDropMethod(WebElement target) {
		 Actions act = new Actions(driver);
		 act.dragAndDrop(src,target).perform();
	 }
	 
	 //To Handle  Keyboard Action
	 public void hitEnterButtonMethod() throws AWTException {
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
	 }
	 
	 public void hitTabButton() throws AWTException {
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
	 }
	 
	 
	 //Handle DropDown
	 
	 public void selectBYIndexMethod(WebElement element ,int index) {
		 Select sel= new Select(element);
		 sel.selectByIndex(index);
	 }
	 
	 public void selectByVisibleTextMethod(WebElement element , String text) {
		 Select sel= new Select(element);
		 sel.selectByVisibleText(text);
	 }
	 
	 public void selectByValue(WebElement element , String value) {
		 Select sel= new Select(element);
		 sel.selectByValue(value);
	 }
}
