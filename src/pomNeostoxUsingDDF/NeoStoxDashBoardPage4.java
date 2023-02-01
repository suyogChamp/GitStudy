package pomNeostoxUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashBoardPage4 {

	//1. declaration
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpOkButton;
	//@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpCloseButton;
	
	@FindBy(id = "lbl_username") private WebElement userName;
	
	@FindBy(id = "lnk_logout") private WebElement logOutButton;
	
	// 2. initialization
	
	public NeoStoxDashBoardPage4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void handlePopUp() throws InterruptedException
	{
		Thread.sleep(500);
		popUpOkButton.click();
		Thread.sleep(500);
		//popUpCloseButton.click();
	}
	
	public void validateText(String expectedText) throws InterruptedException
	{
		Thread.sleep(500);
		
		String actualText = userName.getText();
		
		if(expectedText.equals(actualText))
		{ 
			System.out.println("TC is passed, expected and actual text are matching");
		}
		else
		{ 
			System.out.println("TC is failed, expected and actual text is not matching");
		}
	}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		userName.click();
		Thread.sleep(500);
		
		logOutButton.click();
	}
	
	//public String GetActualText()
	//{
	//	String actualUserName = userName.getText();//he text aplyale string madhe milnar ahe mhanun void chya jagi string ghyayach ani return type string dyayacha
	//	return actualUserName;
	}

