package Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//step1:
         Actions act=new Actions(driver);
//step2:        
       //1st way:
       //  act.doubleClick(DoubleClickButton).perform();
         
       //2nd way:
//         act.moveToElement(DoubleClickButton).build().perform();  
//         act.doubleClick().perform();
         
       //3rd way:
         //if multiple action in single line-->then use build method
        // act.moveToElement(DoubleClickButton).doubleClick().build().perform();
         act.moveToElement(DoubleClickButton).doubleClick().perform();
         
                                                     
        
	}

}
