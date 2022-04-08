package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Rupesh\\selenium\\chromedriver.exe");	
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("honda");
    Thread.sleep(2000);
    List<WebElement> SearchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	System.out.println("Total Search Results are "+SearchResults.size());
	for(WebElement w:SearchResults)
	{
		System.out.println(w.getText());
	}
	Thread.sleep(2000);
	for(WebElement w:SearchResults)
	{
		String ExpectedResult = "honda city";
		String ActualResult=w.getText();
		if(ActualResult.equals(ExpectedResult))
		{
			w.click();
			break;
		}
	}
	Thread.sleep(2000);
	driver.findElement(By.linkText("Images")).click();
	
	
	
	
	
	
	
	
	
	
	}

}
