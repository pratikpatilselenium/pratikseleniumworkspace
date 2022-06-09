package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution2 {
  @Test
  public void Class2() {
	  Reporter.log("class 2",true);
  }
}