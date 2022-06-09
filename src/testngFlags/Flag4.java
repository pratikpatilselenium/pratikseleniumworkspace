package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = 1)
  public void z() {
	  Reporter.log("z()",true);
  }
  
  @Test(priority = 3)
  public void x() {
	  Reporter.log("x()",true);
  }
  
  @Test(priority = 0)
  public void w() {
	  Reporter.log("w()",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("b()",true);
  }
  
  @Test(priority = 9)
  public void a() {
	  Reporter.log("a()",true);
  }
}
