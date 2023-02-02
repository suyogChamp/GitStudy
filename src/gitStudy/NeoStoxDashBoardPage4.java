package gitStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxDashBoardPage4 {

	//1. declaration
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpOkButton;
	//@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpCloseButton;
	
	@FindBy(xpath = "//span[@id='lbl_username']") private WebElement userName;
	
	@FindBy(id = "lnk_logout") private WebElement logOutButton;
	
	@FindBy(id="lbl_curbalancetop")private WebElement AcBalance;
	
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[1]") private WebElement v1;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[2]") private WebElement v2;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[3]") private WebElement v3;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[4]") private WebElement v4;
	@FindBy(xpath="(//div[@class='col-sm-6 text-nowrap ps-1'])[5]") private WebElement v5;
	
	
	// 2. initialization
	
	public NeoStoxDashBoardPage4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void handlePopUp() throws InterruptedException
	{
		if(popUpOkButton.isDisplayed())
		{	Thread.sleep(500);
		popUpOkButton.click();
		Thread.sleep(500);
		Reporter.log("PopUp is handling", true);
		//popUpCloseButton.click();
		}
		else {
			Reporter.log("pop up is not displayed", true);
		}
	}
	
//	public void validateText(String expectedText) throws InterruptedException
//	{
	//	Thread.sleep(500);
		//
//		String actualText = userName.getText();
	//	
		//if(expectedText.equals(actualText))
//		{ 
	//		System.out.println("TC is passed, expected and actual text are matching");
		//}
//		else
	//	{ 
		//	System.out.println("TC is failed, expected and actual text is not matching");
//		}
	//}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		userName.click();
		Thread.sleep(500);
		
		logOutButton.click();
		Reporter.log("Clicking on LogOutButton", true);

	}
	
	public String GetActualText()
	{
		String actualUserName = userName.getText();//he text aplyale string madhe milnar ahe mhanun void chya jagi string ghyayach ani return type string dyayacha
		Reporter.log("Getting actual name", true);

		return actualUserName;
	}
	
	public String GetBalance()
	{
		String balance = AcBalance.getText();
		Reporter.log("Getting actual balance", true);
		Reporter.log("Account balance is "+balance, true);
		return balance;
	}
	public String gettingList()
	{
		List<String> searchlist=new ArrayList<>();
		searchlist.add(v1.getText());
		searchlist.add(v2.getText());
		searchlist.add(v3.getText());
		searchlist.add(v4.getText());
		searchlist.add(v5.getText());
		System.out.println(searchlist);
		
		TreeSet<String> treeset=new TreeSet<String>(searchlist);
		
		 String search = treeset.last();
		return search;
	}
}
