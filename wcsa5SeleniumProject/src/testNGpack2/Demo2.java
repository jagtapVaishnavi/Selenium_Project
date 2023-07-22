package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void methhod3() {
	  Reporter.log("This is method3",true);
  }
  
  @Test
  public void method4() {
	  int a= 5;
	  int b=10;
	  int result = b/a;
	  Reporter.log("This is methhod4",true);
  }
}
