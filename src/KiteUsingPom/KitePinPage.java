package KiteUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	//1. variable declaration
	
		@FindBy(id="pin") private WebElement pin;
		@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
		
		//2. create constructor
		
		public KitePinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//3. create methods
		
		public void enterPin()
		{
			pin.sendKeys("969696");
		}
		
		public void clickOnContinueButton()
		{
			ContinueButton.click();
		}

}
