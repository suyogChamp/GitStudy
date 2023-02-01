package utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	//reading excel sheet
	//implicit wait
	//screenshot
	//scrolling
	// property
	
	public static String ReadDataFromPropertiesFile(String key) throws IOException
	{
		//create object of properties class
		Properties prop=new Properties();
		//create file of property and pass path of property file
		FileInputStream myFile=new FileInputStream("C:\\Users\\user\\Desktop\\suyog\\SeleniumStudy\\myProperty.properties");
		// load file
		prop.load(myFile);
		//read data from properties file
		String value = prop.getProperty(key);
		Reporter.log("Reading data from Property File", true);
		Reporter.log("Data is "+value, true);
		return value;
	}
	
	public static String ReadingExcelSheet(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Selenium\\NeostoxDetails.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Reading data from row--> "+row+" and cell "+cell, true);
		return value;
	}
	
	public static void implicitWait(WebDriver driver,int time)
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Waiting for "+time+" ms", true);
	}
	
	public static void TakeScreenshot(WebDriver driver,String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Selenium\\ScreenShot\\"+name+".png");
		FileHandler.copy(source, dest);
		Reporter.log("Taking screenshot and saving it to "+dest, true);
	}
	
	public static void Scrolling(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;", element);
		Reporter.log("scrolling to "+element, true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
