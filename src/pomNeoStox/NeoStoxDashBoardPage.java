package pomNeoStox;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashBoardPage {

	//1. declaration
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpOkButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpCloseButton;
	
	@FindBy(id = "lbl_username") private WebElement userName;
	
	@FindBy(id = "lnk_logout") private WebElement logOutButton;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[1]") private WebElement v1;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[2]") private WebElement v2;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[3]") private WebElement v3;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[4]") private WebElement v4;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[5]") private WebElement v5;
	
	
	
	// 2. initialization
	
	public NeoStoxDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void handlePopUp() throws InterruptedException
	{
		Thread.sleep(500);
		popUpOkButton.click();
		Thread.sleep(500);
		popUpCloseButton.click();
	}
	
	public void validateText() throws InterruptedException
	{
		Thread.sleep(500);
		String expectedText="Hi suyog vaidya";
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
	
	public void clickOnLogOutButton()
	{
		userName.click();
		
		logOutButton.click();
	}
	
	public void gettingList()
	{
		List<String> searchlist=new ArrayList<>();
		searchlist.add(v1.getText());
		searchlist.add(v2.getText());
		searchlist.add(v3.getText());
		searchlist.add(v4.getText());
		searchlist.add(v5.getText());
		System.out.println(searchlist);
		
		TreeSet<String> treeset=new TreeSet<String>(searchlist);
		
		 System.out.println(treeset.last());
	}
	
	
}
