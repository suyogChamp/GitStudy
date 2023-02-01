package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest3 {
// ya madhe apan group create karun tya group madhlyach method kashya run karayachya te pahu ya
// ya madhe test3 ani test4 ya don class cha use kela ahe
	
  @Test(groups = "reg")
  public void a() 
  {
	  Reporter.log("A is running", true);
  }
  @Test(groups = "sanity")
  public void e() 
  {
	  Reporter.log("E is running", true);
  }
  @Test(groups = {"reg","sanity"})
  public void b() 
  {
	  Reporter.log("B is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("C is running", true);
  }
  @Test(groups = "sanity")
  public void d() 
  {
	  Reporter.log("D is running", true);
  }
}
