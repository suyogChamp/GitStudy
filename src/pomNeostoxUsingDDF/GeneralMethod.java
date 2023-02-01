package pomNeostoxUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethod {
	
	//reading excel sheet
	//implicit wait
	//screenshot
	//scrolling
	
	public static String ReadingExcelSheet(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Selenium\\NeostoxDetails.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void implicitWait(WebDriver driver,int time)
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void TakeScreenshot(WebDriver driver,String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Selenium\\ScreenShot\\"+name+".png");
		FileHandler.copy(source, dest);
	}
	
	public static void Scrolling(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;", element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
