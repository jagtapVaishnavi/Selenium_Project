package testNGAnnotations_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test (enabled = true)
  public void method1() {
	  Reporter.log("Method1 from flag 2",true);
  }
  
  @Test(enabled = false)
  public void method2() {
	  Reporter.log("Method2 from flag 2",true);
  }
}
