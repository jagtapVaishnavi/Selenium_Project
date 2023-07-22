package testNGAnnotations_flags;

import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void f() {
	  System.out.println("f");
  }
  
  @Test(priority = 0)
  public void e() {
	  System.out.println("e");
  }
  
  @Test
  public void p() {
	  System.out.println("p");
  }
  
  @Test(priority = 1)
  public void m() {
	 System.out.println("m");
  }
  
  @Test
  public void d() {
	  System.out.println("d");
  }
  
  @Test(priority = 2)
  public void s() {
	  System.out.println("s");
  }
  
  @Test
  public void v() {
	  System.out.println("v");
  }
  
  @Test(priority = 1)
  public void n() {
	  System.out.println("n");
  }
  
}
