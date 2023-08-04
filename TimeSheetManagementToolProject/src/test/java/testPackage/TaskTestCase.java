package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;

public class TaskTestCase extends BaseTest{
	 @Test
	  public void project_customerMethod() throws IOException {
		  
		  LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
	      HomePage hp = new HomePage(driver);
	      hp.clickOntaskModule();
	      // we are there in Task page
	      TaskPage ts = new TaskPage(driver);
	      // create the customer.
	      ts.createNewCustomerMethod(flib.readExcelData(EXCEL_PATH,Cust_PROSHEET_NAME,1,0));
	      // Create the project
	      ts.createNewProjectMethod(flib.readExcelData(EXCEL_PATH,Cust_PROSHEET_NAME,1,0),flib.readExcelData(EXCEL_PATH,Cust_PROSHEET_NAME,1,1));
	  
	  }
}
