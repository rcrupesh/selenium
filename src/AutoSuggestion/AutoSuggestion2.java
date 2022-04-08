package AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Rupesh\\selenium\\chromedriver.exe");	
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13 pro max");
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//li[@class='Y5N33s'])[1]")).click();
	     Thread.sleep(10000);
	     WebElement ratings = driver.findElement(By.xpath("Thread.sleep(2000);"));
	     System.out.println("rating for result is "+ratings.getText());
	
	
	
	
	
	
	}

}
