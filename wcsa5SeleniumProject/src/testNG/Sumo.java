package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void h() {
	  Reporter.log("This is a Sumo class of testNG", true);
  }
  @Test
  public void i() {
	  Reporter.log("This is a Sumo-1 class of testNG", false);
  }
  
}
