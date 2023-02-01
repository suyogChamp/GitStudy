package pomNeostoxUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomNeoStox.NeoStoxDashBoardPage;
import pomNeoStox.NeoStoxHomePage;
import pomNeoStox.NeoStoxPasswordPage;
import pomNeoStox.NeoStoxSignInPage;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://neostox.com/");
		Thread.sleep(2000);
		
		File MyFile=new File("C:\\Selenium\\NeostoxDetails.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		String mobnum = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pwd=mySheet.getRow(0).getCell(1).getStringCellValue();
		String expName=mySheet.getRow(0).getCell(2).getStringCellValue();
		// Create object of homepage
		 
		NeoStoxHomePage1 home = new NeoStoxHomePage1(driver);
		home.clickOnSignInButton();
		
		// Create object of signIn page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		NeoStoxSignInPage2 signIn =new NeoStoxSignInPage2(driver);
		signIn.EnterMobileNo(mobnum);
		signIn.clickOnSignInButton();
		
		// Create object of password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		NeoStoxPasswordPage3 password =new NeoStoxPasswordPage3(driver);
		password.enterPassword(pwd);
		password.clickOnSubmitButton();
		
		// Create object of dash board page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		
		NeoStoxDashBoardPage4 dashBoard =new NeoStoxDashBoardPage4(driver);
		dashBoard.handlePopUp();
		dashBoard.validateText(expName);
		dashBoard.clickOnLogOutButton();
		
		driver.close();
	}

}
