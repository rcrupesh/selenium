package KiteUsingPom_and_DD;

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
			
		//3.
			
			public void enterPin(String realpin)
			{
				pin.sendKeys(realpin);
			}
			
			public void clickOnContinueButton()
			{
				ContinueButton.click();
			}

	

}
