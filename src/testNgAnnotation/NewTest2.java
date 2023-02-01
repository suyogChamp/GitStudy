package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void testing2() 
  {
	  Reporter.log("hi testing2 is running", true);
  }
}
