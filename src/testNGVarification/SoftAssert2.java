package testNGVarification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 {
// ya class madhe don @test ahe jar apan object crrerate karatana jar to ekhadya method madhe kela tr to tyach method poorata limited rahil
// mnje tolocal object create hoil
// ithe don method aslya mule object cha vapara ya class madhlya pratek method la vhava mnun apan global object create karayacha
	
	SoftAssert soft=new SoftAssert();
	
	
  @Test
  public void f() 
  {
	  boolean a=false;
	  boolean b=true;
	 
	  soft.assertTrue(a,"value of a is not true, TC is failed");
	  soft.assertFalse(b,"value of b is not false, TC is failed");
	  soft.assertAll();
  }
  
  @Test
  public void h()
  {
	  String a="suyog";
	  String b="suyog";
	  String c="saurabh";
	  
	  soft.assertNotEquals(a, b,"a and b are equal, TC is failed");
	  soft.assertEquals(b, c,"b and c are not equal, TC is failed");
  }
}
