package pop_ups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/ ");
		Thread.sleep(2000);

		// 1 How to handle child browser popup

		// to handle child browser popup we need to sswitch to that child browser
		// to switch we need to have ID of that page
		// to get that id we use one method i.e getwindowhandle

		String MainPageID = driver.getWindowHandle();// .......ya method n ekach window cha id yete main page cha

		System.out.println("ID of main page is " + MainPageID);

		driver.findElement(By.name("NewWindow")).click();

		// ata ithe aplyale child browser popup yeil mnjech multiple windows yeil
		// tr mg aplyale to popup handle kara sathi tyacha pn id lagel
		// t tya sathi getwindowhandles hi method ghyavi lagel

		// hi method aplyale set of string return karate ..ani pahila id ha main page
		// cha ch asto

		Set<String> Id = driver.getWindowHandles();

		Iterator<String> it = Id.iterator();
		String mainPageID = it.next();
		System.out.println("ID of main page " + mainPageID);

		String ChildID = it.next();
		System.out.println("ID of child page " + ChildID);

		// switching focus to child page
		driver.switchTo().window(ChildID);
		Thread.sleep(1000);
		driver.manage().window().maximize();

		String Text = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
		System.out.println("text on child page is " + Text);
		driver.close();

        //ata apan ith jari child page la close kel asel tari apan main page vr khich nhi karu shakat...mnun pahile aplyale apala focus vapas main page vr ghyava lagel

        //switching focus to main page
		driver.switchTo().window(mainPageID);
		String text = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']")).getText();

		System.out.println("text on main page is " + text);
		driver.close();

	}

}
