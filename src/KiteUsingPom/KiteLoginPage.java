package KiteUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
		//step1: variable declaration
		@FindBy(id="userid") private WebElement UserID;
		@FindBy(id="password") private WebElement Password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
		
	//Step 2: create constructor 
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}	
		
	//Step 3: create methods 
		
		public void enterUserID()
		{
			UserID.sendKeys("HD5857");
		}
		
		public void enterPassword()
		{
			Password.sendKeys("Ajinkya@123");
		}
		
		public void clickOnLoginButton()
		{
			LoginButton.click();
		}

	

}
