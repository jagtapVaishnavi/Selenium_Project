package testNGAnnotations_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleFlag {
	@Test(description = "Login method" , enabled = true)
	  public void method1() {
		  Reporter.log("Method1 from flag 2",true);
	  }
	  
	  @Test(description = "Logout method",enabled = true)
	  public void method2() {
		  Reporter.log("Method2 from flag 2",true);
	  }
}
