package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


     // () madhe apan Listener class cha path and extention takal ahe..class path= packageName.ClassName.extention
public class MyTesting {
  @Test
  public void A() 
  {
	  Reporter.log("TC A is running", true);
  }
  
  @Test
  public void B()
  {   Assert.fail();
	  Reporter.log("TC B is running", true);
  }
  
  @Test(dependsOnMethods = "B")          // apalyalal C la skip karayach hot..ani ekhadi method tevha skip hot aste jevha ti method jya method vr depend aste ti fail hote
  public void C()
  {
	  Reporter.log("TC C is running", true);
  }
}
