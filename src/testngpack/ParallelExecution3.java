package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution3 {
  @Test
  public void Class3() {
	  Reporter.log("class 3",true);
  }
}