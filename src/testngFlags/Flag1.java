package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "flag 1 of method f()")
  public void f() {
	  Reporter.log("f()",true);
  }
}
