package KiteUsingPom_and_DD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1.
	
			@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
			@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
			
			
			//2.
			
			public KiteHomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//3.
			
			public void validateUserName(String un)
			{
			String 	expectedUserName=un;      //document excel sheet
			
			String actualUserName = userID.getText();
			
			if(actualUserName.equals(expectedUserName))
			{
				System.out.println("Username is matching TC is passed");
			}
			
			else 
				{
					System.out.println("Username is not matching TC is failed");
				}
			
			}
			
			
			public void loggingout() throws InterruptedException
			{
				userID.click();
				Thread.sleep(100);
				logOutButton.click();
			}

}
