package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMethod1() {
	  long testId1 = Thread.currentThread().getId();
	  Reporter.log("Thread id of method1:" +testId1 ,true);
  }
  @Test
  public void testMethod2() {
	  long testId2 = Thread.currentThread().getId();
	  Reporter.log("Thread id of method2:" +testId2 ,true);
  }
}
