package gitStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignInPage2 {

	// 1. declaring variables
	
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNoField;
	@FindBy(id = "lnk_signup1") private WebElement signInButton;
	@FindBy(xpath = "(//span[@class='errmsg'])[1]")private WebElement Invalid;
	// 2. initializing variable
	
	public NeoStoxSignInPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	// 3. usage
	
	public void EnterMobileNo(String mobileno) throws EncryptedDocumentException, IOException
	{
		
		mobileNoField.sendKeys(mobileno);
		Reporter.log("Entering mobile number", true);

		
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
		Reporter.log("clicking on sign in button", true);

	}
	public String wrongNumMsg()
	{
		String msg = Invalid.getText();
		Reporter.log(msg, true);
		return msg;
	}
	
}
