package testngFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	 @Test
	  public void f() {
		  Assert.fail();
		  Reporter.log("f()",true);
	  }
	  
	  @Test(dependsOnMethods = "f" , alwaysRun = true)
	  public void a() {
		  Reporter.log("a()",true);
	  }
	  
	  @Test(dependsOnMethods = "a", alwaysRun = true)
	  public void g() {
		  Reporter.log("g()",true);
	  }
}
