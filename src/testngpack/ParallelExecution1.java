package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution1 {
  @Test
  public void Class1() {
	  Reporter.log("class 1",true);
  }
}
