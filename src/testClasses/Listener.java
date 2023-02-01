package testClasses;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseClass.Base;
import utilityClasses.Utility;

public class Listener extends Base implements  ITestListener

   {@Override
    public void onTestFailure(ITestResult result) 
   {
	   Reporter.log("TC "+result.getName()+"failed", true);
	   try {
		Utility.TakeScreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
