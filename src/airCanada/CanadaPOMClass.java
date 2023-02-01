package airCanada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanadaPOMClass {
	
	@FindBy(xpath = "(//div[@class='abc-form-element-radio-button-container'])[2]") private WebElement radiobutton;
	
	public CanadaPOMClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public boolean clickOnRadioButton()
	{
		radiobutton.click();
         boolean radio = radiobutton.isSelected();
		return radio;		
		
	}
	
}
