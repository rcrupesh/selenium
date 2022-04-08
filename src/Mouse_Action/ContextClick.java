package Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
  //step1:      
        WebElement RightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        
  //step2: 
       // 1st way:-
        //act.moveToElement(RightClickButton).perform();
       //act.contextClick().perform();  //this method is right click on element
        
       //2nd way:- 
        act.contextClick(RightClickButton).perform();
        
        

	}

}
