package radioButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPOM1 {
	
	@FindBy(xpath = "(//a[@role='button'])[2]") private WebElement CreateButton;
	
     public FBPOM1(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
	
     public void clickoncreateButton()
     {
    	 CreateButton.click();
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
}
