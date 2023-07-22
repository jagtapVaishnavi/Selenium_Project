package testNGAnnotations_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Functional testcase")
  public void ft1() {
	  Reporter.log("Functional Testcase1",true);
  }
  
  @Test(groups = "Smoke testcase")
  public void st1() {
	  Reporter.log("Smoke Testcase1",true);
  }
  
  @Test(groups = "Integration testcase")
  public void it1() {
	  Reporter.log("Integration Testcase1",true);
  }
  //__________________________________________________________________________________________________________________
  
  @Test(groups = "Functional testcase")
  public void ft2() {
	  Reporter.log("Functional Testcase2",true);
  }
  
  @Test(groups = "Smoke testcase")
  public void st2() {
	  Reporter.log("Smoke Testcase2",true);
  }
  
  @Test(groups = "Integration testcase")
  public void it2() {
	  Reporter.log("Integration Testcase2",true);
  }
  //_________________________________________________________________________________________________________________________
  
  @Test(groups = "Functional testcase")
  public void ft3() {
	  Reporter.log("Functional Testcase3",true);
  }
  
  @Test(groups = "Smoke testcase")
  public void st3() {
	  Reporter.log("Smoke Testcase3",true);
  }
  
  @Test(groups = "Integration testcase")
  public void it3() {
	  Reporter.log("Integration Testcase3",true);
  }
  
// ____________________________________________________________________________________________________________________________________
  
  @Test(groups = "Functional testcase")
  public void ft4() {
	  Reporter.log("Functional Testcase4",true);
  }
  
  @Test(groups = "Smoke testcase")
  public void st4() {
	  Reporter.log("Smoke Testcase4",true);
  }
  
  @Test(groups = "Integration testcase")
  public void it4() {
	  Reporter.log("Integration Testcase4",true);
  }
  
 // __________________________________________________________________________________________________________________________________
  
  @Test(groups = "Functional testcase")
  public void ft5() {
	  Reporter.log("Functional Testcase5",true);
  }
  
  @Test(groups = "Smoke testcase")
  public void st5() {
	  Reporter.log("Smoke Testcase5",true);
  }
  
  @Test(groups = "Integration testcase")
  public void it5() {
	  Reporter.log("Integration Testcase5",true);
  }
 // ______________________________________________________________________________________________________________________________
  
  @Test(groups = "Functional testcase")
  public void ft6() {
	  Reporter.log("Functional Testcase6",true);
  }
  
  @Test(groups = "Smoke testcase")
  public void st6() {
	  Reporter.log("Smoke Testcase6",true);
  }
  
  @Test(groups = "Integration testcase")
  public void it6() {
	  Reporter.log("Integration Testcase6",true);
  }
}
