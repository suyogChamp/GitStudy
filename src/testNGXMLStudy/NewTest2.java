package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
	
// ithe apan test1 ani test2 ya donhi class milun method include ani exclude karnar ahe
	
	@Test
  public void f()
	{
		Reporter.log("F is running", true);
  }
	@Test
	  public void g()
		{
			Reporter.log("G is running", true);
	  }
	@Test
	  public void i()
		{
			Reporter.log("I is running", true);
	  }
	@Test
	  public void h()
		{
			Reporter.log("H is running", true);
	  }
	@Test
	  public void j()
		{
			Reporter.log("J is running", true);
	  }
}
