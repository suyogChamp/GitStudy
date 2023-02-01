package testNGVarification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy2 {
  @Test
  public void f() 
  {
	  // hi method vaparatana aplyala don variable lagel tevhach apan equal ahe ki nhi te verify karu  shakanar
	  
	  String a="abcd";
	  String b="abcd";
	  
	  Assert.assertEquals(a, b,"a and b are not equal hence TC failed");
	  
// b nantr jo apan msg lihila ahe tyala "Assertion Error" mhanatat ani to lihitana aplyala negative vichar karun dya lagate
// mnje as samjaych ki TC fail zali
// ani to msg aplyala tevhach disto jevha apali TC fail hoil
// ata ya situation madhe apli TC passed hot ahe mnje ha msg disnar nhi	  
  }
  
  @Test
  public void h()
  {
	  String c="abc";
	  String d="abcd";
	  Assert.assertEquals(c, d,"c and d are not equal, TC failed");
		
	// ithe apali TC fail hoil mhanun ithe assertion error disel  
  }
  
  
  
  
  
  
  
}
