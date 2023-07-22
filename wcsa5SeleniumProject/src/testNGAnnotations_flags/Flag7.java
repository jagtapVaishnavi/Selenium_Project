package testNGAnnotations_flags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  @Test
  public void loginMethod() {
	  System.out.println("It is used to perform Login!!");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod() {
	  Assert.fail();
	  System.out.println("It is use to create User!!");
  }
  
  @Test(dependsOnMethods = "createUserMethod",alwaysRun = true)
  public void logoutMethod() {
	  System.out.println("It is use to perform logout!!");
  }
}
