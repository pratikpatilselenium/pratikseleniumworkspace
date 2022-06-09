package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(groups = "Functional")
  public void ftc1() {
	  Reporter.log("ftc01",true);
  }
  
  @Test(groups = "Smoke")
  public void stc1() {
	  Reporter.log("stc01",true);
  }
  
  @Test(groups = "Integration")
  public void itc1() {
	  Reporter.log("itc01",true);
  }
  
  @Test(groups = "Functional")
  public void ftc2() {
	  Reporter.log("ftc02",true);
  }
  
  @Test(groups = "Smoke")
  public void stc2() {
	  Reporter.log("stc02",true);
  }
  
  @Test(groups = "Integration")
  public void itc2() {
	  Reporter.log("itc02",true);
  }
}
