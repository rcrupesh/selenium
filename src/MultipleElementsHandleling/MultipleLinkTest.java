package MultipleElementsHandleling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinkTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total number of Links are "+links.size());
	for(WebElement w:links)
	{
		System.out.println(w.getText());
	}
	driver.close();

	}

}
