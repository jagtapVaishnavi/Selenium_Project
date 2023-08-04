package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;



public class ValidLoginTestCase extends BaseTest{
  @Test
  public void loginMethod() throws IOException {
	  //To Perform Login call The method loginPage POM Class
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  
	  //To call the Web Element of login page create the object of login page class

	lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
	
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void inValidLoginMethod() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  int rc = flib.getLastRowCount(EXCEL_PATH,INVALIDSHEET_NAME);
	  for(int i=1;i<=rc;i++)
	  {
		  lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH,INVALIDSHEET_NAME,i,0),flib.readExcelData(EXCEL_PATH, INVALIDSHEET_NAME, i,1));
	  }
  }
}
