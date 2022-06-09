package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNgClass {
  @Test
  public void method1() 
  {
	  Reporter.log("method 1 executed",true);
  }
  
  @Test
  public void method2()
  {
	  int i=0;
	  int res=4/i;
	  Reporter.log("method 2 executed",true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("method 3 executed",true);
  }
  
  @Test
  public void method4()
  {
	  Reporter.log("method 3 executed",true);
  }
  
}
