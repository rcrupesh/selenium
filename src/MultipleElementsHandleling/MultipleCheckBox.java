package MultipleElementsHandleling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Check Boxes are "+CheckBoxes.size());
        for(WebElement w:CheckBoxes)
        {
        	Thread.sleep(2000);
        	w.click();
        }
        for(WebElement w:CheckBoxes)
        {
        	Thread.sleep(2000);
        	w.click();
        }
	}

}
