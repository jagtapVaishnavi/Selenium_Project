package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	@Test
	  public void testMethod5() {
		  long testId1 = Thread.currentThread().getId();
		  Reporter.log("Thread id of method1:" +testId1 ,true);
	  }
	  @Test
	  public void testMethod6() {
		  long testId2 = Thread.currentThread().getId();
		  Reporter.log("Thread id of method2:" +testId2 ,true);
	  }
}
