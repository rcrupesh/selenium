package Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickUsiongActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://vctcpune.com/selenium/practice.html");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         WebElement HomePageButton = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
         //can use webElement method click
         
        // using Actions Class-->how to click
//step:1)Create object of Action Class and pass Driver Object
         Actions act=new Actions(driver);
         
 //step:2)use Action Class Object and call Method call perform method-->click(WebElement target)
         //1)
//         act.click(HomePageButton).perform() ; //1st way to click
         
         //2)
//         act.moveToElement(HomePageButton).perform();  //2nd way to click
//         Thread.sleep(2000);
//         act.click().perform();
        // act.moveToElement(HomePageButton).click().perform();
        act.moveToElement(HomePageButton).click().build().perform();
	}

}
