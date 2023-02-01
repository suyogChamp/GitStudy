package pomNeostoxUsingDDF;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage3 {
	
	// 1. declaration
	
	@FindBy(id = "txt_accesspin") private WebElement passwordField;
	@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
	
	//2. initialization
	
	public NeoStoxPasswordPage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	//3. usage
	
	public void enterPassword(String pwd)
	{
		passwordField.sendKeys(pwd);
	}
	
	public void clickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(500);
		submitButton.click();
	}
	
	
	
}
