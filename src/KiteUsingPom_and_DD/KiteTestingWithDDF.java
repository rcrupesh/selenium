package KiteUsingPom_and_DD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestingWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Rupesh\\selenium\\chromedriver.exe");	
		//==========
		ChromeOptions opt=new ChromeOptions();// created object of chrome options
		opt.addArguments("headless");// you are asking not to open browser 
		WebDriver driver= new ChromeDriver(opt);
		//==========
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//===================

		FileInputStream MyFile= new FileInputStream("D:\\Rupesh\\selenium\\Myexcelsheet.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		String UN = MySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		Thread.sleep(1000);
		KiteLoginPage login= new KiteLoginPage(driver);  //obj
		//login.enterPassword(MySheet.getRow(0).getCell(1).getStringCellValue())
		login.enterUserID(UN);    //obj.methodname
		login.enterPassword(PWD);
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin= new KitePinPage(driver);
		pin.enterPin(PIN);
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName(UN);
		home.loggingout();
		
		driver.close();
		
		

	}

}
