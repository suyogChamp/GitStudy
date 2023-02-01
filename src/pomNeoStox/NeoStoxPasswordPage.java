package pomNeoStox;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage {
	
	// 1. declaration
	
	@FindBy(id = "txt_accesspin") private WebElement passwordField;
	@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
	
	//2. initialization
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	//3. usage
	
	public void enterPassword()
	{
		passwordField.sendKeys("9890");
	}
	
	public void clickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(500);
		submitButton.click();
	}
	
	
	
}
