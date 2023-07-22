package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  //System.out.println("This is a demo class of testNG");
	  Reporter.log("This the demo class", true);
  }
}
