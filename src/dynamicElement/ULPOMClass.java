package dynamicElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULPOMClass {
	
	@FindBy(xpath = "//input[@class='gLFyf']") private WebElement SearchBox;
	@FindBy(xpath = "//ul[@role='listbox']") private WebElement list;
	
	public ULPOMClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void honda()
	{
		SearchBox.sendKeys("honda");
	}
	
	public void GettingList()
	{
		for(Object a:list)
			
			System.out.println(a);
	}
	
	// nhi jamat ahe he
	
	
	
}
