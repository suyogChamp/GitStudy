package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
  @Test(enabled = false)
  public void a() 
  {
	  Reporter.log("A is running", true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("B is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("C is running", true);
  }
  
 // enable chi default value "true" aste
  // jar aplyala ekhadi method execute karayachi nasel tar apan enable false deu
  // ani konati method ignore keli he index.html madhe ignored method madhe disate 
  
  
  
  
  
  
  
  
}
