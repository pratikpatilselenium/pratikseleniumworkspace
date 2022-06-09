package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled = true)
  public void a() {
	  Reporter.log("flag 2 Method a() ",true);
  }
  
  @Test(enabled = false)
  public void b() {
	  Reporter.log("flag 2 Method b() ",true);
  }
}
