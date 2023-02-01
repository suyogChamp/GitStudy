package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void testing1()
  {
	  Reporter.log("hii testing1 is running", true);
  }
}
