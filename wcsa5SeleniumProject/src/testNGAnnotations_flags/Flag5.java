package testNGAnnotations_flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void loginMethod() {
	  System.out.println("It is used to perform Login!!");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod() {
	  System.out.println("It is used to create the user");
  }
  
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod() {
	  System.out.println("It is used to Logout!!");
  }
}
