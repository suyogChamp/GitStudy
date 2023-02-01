package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://paytm.com/");
		//String ActualText = driver.findElement(By.xpath("//h1[contains(text(),'Recharge & Pay Bills')]")).getText();
	//	System.out.println("actual text is "+ActualText);
	//	String expectedText="Recharge & Pay Bills on Paytm.";
		//System.out.println("expected text is "+expectedText);
	//	if(ActualText.equals(expectedText))
		//{
			//System.out.println("text is matching and TC is passed");
		//}
		//else {
			//System.out.println("text is not matching and text is failed");

		//}
		 
		driver.get("https://vctcpune.com/");
		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry')]"));
		System.out.println("text is "+text.getText());
		
		// asha prakare sudhha apan method vaparu shakto
		
	}
	

}
