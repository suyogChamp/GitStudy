package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test
  public void a() 
  { 
	  Reporter.log("A is running", true);
  }
  @Test
  public void b() 
  { 
	  Reporter.log("B is running", true);
  }
  @Test(priority = -1)
  public void c() 
  { 
	  Reporter.log("C is running", true);
  }
  
}// ata ithe execution a b c vhayala pahije hota...pan apan priority int sarvat kami c la dila ahe
// mhanun pahile c execute hoil ani nanter a & c
