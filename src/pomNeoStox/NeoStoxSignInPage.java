package pomNeoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage {

	// 1. declaring variables
	
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNoField;
	@FindBy(id = "lnk_signup1") private WebElement signInButton;
	
	// 2. initializing variable
	
	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	// 3. usage
	
	public void EnterMobileNo() throws EncryptedDocumentException, IOException
	{
		
		mobileNoField.sendKeys("8459313029");
		
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
}
