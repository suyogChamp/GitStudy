package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener

{
    @Override
    public void onTestSuccess(ITestResult result)
    {    
        String testname = result.getName();
    	Reporter.log("TC "+testname+" is passed", true);
    }
    
    @Override
    public void onTestFailure(ITestResult result) 
    {
    	Reporter.log("TC "+result.getName()+" is failed,Please try again", true);

    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
    	Reporter.log("TC "+result.getName()+" is skipped,Please have a look", true);

    }
    
    
    // this is a listener class...this is not a TestNg class..it is simple java class
    // and it has implemented ITestListener interface
    
    
    
    
    
    
    
}
