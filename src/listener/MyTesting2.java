package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


      // () madhe apan Listener class cha path and extention takal ahe..class path= packageName.ClassName.extention
public class MyTesting2 {
  @Test
  public void P() 
  {
	  Reporter.log("TC P is running", true);
  }
  
  @Test
  public void Q()
  {   Assert.fail();
	  Reporter.log("TC Q is running", true);
  }
  
  @Test(dependsOnMethods = "Q")          // apalyalal C la skip karayach hot..ani ekhadi method tevha skip hot aste jevha ti method jya method vr depend aste ti fail hote
  public void R()
  {
	  Reporter.log("TC R is running", true);
  }
}
