package Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();	
        driver.get("https://qavbox.github.io/demo/dragndrop/");
         WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
         WebElement Destination = driver.findElement(By.xpath("//div[@id='droppable']"));

//step1:
           Actions act=new Actions(driver);

                     Thread.sleep(2000);
//step2:
       //1              
        //act.dragAndDrop(source, Destination).perform();
                     
      //2
        //act.moveToElement(source).clickAndHold().moveToElement(Destination).release().build().perform();
                     
       //3              
          act.clickAndHold(source).moveToElement(Destination).perform();
	}

}
