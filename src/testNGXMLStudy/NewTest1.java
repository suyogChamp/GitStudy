package testNGXMLStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
	// yamadhe apan methods include and exclude karan shikat ahe
  @Test
  public void a() 
  {
	  Assert.fail();
	  Reporter.log("A us running", true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("B us running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("C us running", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("D us running", true);
  }
  @Test
  public void e() 
  {
	  Reporter.log("E us running", true);
  }
}
