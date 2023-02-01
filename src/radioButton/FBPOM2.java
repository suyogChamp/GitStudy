package radioButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPOM2 {

	
	@FindBy(xpath = "(//input[@type='radio'])[2]") private WebElement RadioButton;
	
	public FBPOM2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRadioButton()
	{
		RadioButton.click();
		boolean radio = RadioButton.isSelected();
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
