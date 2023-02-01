package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void test() 
  {
	  Reporter.log("hi test is running", true);
  }
  @BeforeMethod
  public void before()
  {
	  Reporter.log("hi before method is running", true);
  }
  
  @AfterMethod
  public void after()
  {
	  Reporter.log("hi after method is running", true);
  }
  
  @AfterSuite
  public void afsuite()
  {
	  Reporter.log("hi after suite is running", true);
  }
  
  @AfterClass
  public void afclass()
  {
	  Reporter.log("hi after class is running", true);
  }
  
  @BeforeSuite
  public void bfsuite()
  {
	  Reporter.log("hi before suit is running", true);
  }
  
  // mi he annotations sequence n nhi lihilya...pan tarihi tya sequence n ch execute hoil
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
