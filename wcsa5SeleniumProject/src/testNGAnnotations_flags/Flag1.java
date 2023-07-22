package testNGAnnotations_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//It is used to describe the method or test case
	//It is used with the annotation
	//default value of description is empty
  @Test(description = "Login method")
  public void method1() {
	  Reporter.log("method1 from flag1");
  }
  
  
  @Test(description = "Logout method")
  public void method2() {
	  Reporter.log("method2 from flag1");
  }
}
