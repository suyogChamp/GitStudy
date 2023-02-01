package radioButton;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FBPOM3 {

	@FindBy(xpath = "//input[@type='radio']") private WebElement RadioButtons;
	

	
	
	public FBPOM3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnButtons()
	{
		for(int i=0;i<=2;i++)
		{
			RadioButtons.get
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
