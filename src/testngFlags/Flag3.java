package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 200)
  public void lgn() {
	  Reporter.log("Flag 3 method lgn()",true);
  }
}
