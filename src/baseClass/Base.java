package baseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utilityClasses.Utility;

public class Base {

	protected static WebDriver driver;
	public void LaunchingApp() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.get("https://neostox.com/");
	    // ata aplyale url property file madhun ghyayachi ahe
	    driver.get(Utility.ReadDataFromPropertiesFile("url"));
		Utility.implicitWait(driver, 1000);
		Reporter.log("Launching Application", true);
		
	}
	
	//apan driver la protected kela apan tyala public pan karu shakat hoto pn nahitari apan base class la test class madhe extend karnarch aho
}   // karan ki aplyala launching app hi method ghen ahe
   // ani aplyala mahit ahe ki protected access specifier vaparalyavr tyala jar package chya baher vaparacha asla t aplyala inheritance vapara lagate
// ani apan ts pn base class la extend karnarch ahe



 // agodar apala driver fkt protected hota pn ata static pn zala karan ki apan jevha listener use kela tevha aplya fail test case cha pn screenshot nighav mnun apan 
// screenshot chi method tya madhe takali..aplyala scr kadtana driver chi avshyakata aste mnun apn listner class madhe base class pn extend kel..
// pn tevha compiler thoda confuse zala asta ...mnun mg apan base class madhlya driver la static pn kel
