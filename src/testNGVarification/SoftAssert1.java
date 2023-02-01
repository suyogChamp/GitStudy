package testNGVarification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	// hard assert chya disadvantage la overcome karnyasathi soft assert use karatat
	// soft assert madhlya methods same ahe hard assert sarkhya
	// pan soft assert chya methods ya non static ahe
	// mhanun yachyat object create karava lagto
	// ani yamdhe assertAll() hi method compulsory use karavi ch lagate
	
	
	
  @Test
  public void f() 
  {
	  String a="abc";
	  String b="abce";
	  String c="abcd";
	  
	 SoftAssert soft =new SoftAssert();  // object creation...SoftAssert ha inbuilt class ahe
	 
	 soft.assertEquals(a, b,"a and b are not equal, TC is failed");
	 soft.assertEquals(b, c,"b and c are not equal, TCis failed");
	 soft.assertAll();
	 
	 // he run kelyavr jar apan testng madhe pahil tr aplyala donhi yache assert error msg distat
	 // yacha meaning asa ki donhi point execute zale
	 // pan hech jar hard assert ast t aplyale pahilyach point cha msg disla asta..karan ki pahili fail zalymule dusari execute ch nasti zali
  }
}
