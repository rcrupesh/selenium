package KiteUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Rupesh\\selenium\\chromedriver.exe");	
	    WebDriver driver =new ChromeDriver();
		//=======
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//==========
		KiteLoginPage login= new KiteLoginPage(driver);   //constructor object with parameter
		
		login.enterUserID();
		login.enterPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin= new KitePinPage(driver);
		pin.enterPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserID();
		home.logout();
		
		driver.close();

	}

}
