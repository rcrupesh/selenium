package KiteUsingPom_and_DD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class KiteLoginPage {
	//step1: variable declaration
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
//Step 2: create constructor 
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
//step3:
	
	public void enterUserID(String username)
	{
		
		UserID.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}

}
