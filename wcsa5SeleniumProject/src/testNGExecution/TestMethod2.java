package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	@Test
	  public void testMethod3() {
		  long testId1 = Thread.currentThread().getId();
		  Reporter.log("Thread id of method3:" +testId1 ,true);
	  }
	  @Test
	  public void testMethod4() {
		  long testId2 = Thread.currentThread().getId();
		  Reporter.log("Thread id of method4:" +testId2 ,true);
	  }
}
