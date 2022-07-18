package utils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DashBoard_Page;
import pageObjects.LoginPage_Page;
import pageObjects.Monster_com_Page;

public class BaseFile {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	/*
	 * ==================Declare all objects for methods created
	 * HERE=============================================
	 */

	public static DashBoard_Page dpage ;
	public static LoginPage_Page lpage ;
	public static Monster_com_Page mCom ;
	
	

	public static WebDriver getDriver() {
		if (driver == null || driver.equals("")) {
			try {
				driver = webdrivermanager();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return driver;
	}

	public static WebDriver webdrivermanager() throws IOException {
		if (driver == null) {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//test//resources//global.properties");
			Properties prop = new Properties();
			prop.load(fis);

			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

				driver = WebDriverManager.chromedriver().create();
				driver.manage().window().maximize();
			} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = WebDriverManager.firefoxdriver().create();
				driver.manage().window().maximize();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // i think this is the correct location
						
			
			mCom = PageFactory.initElements(getDriver(), Monster_com_Page.class);	// coz when ever a driver is created ,
			dpage = PageFactory.initElements(getDriver(), DashBoard_Page.class);
			lpage = PageFactory.initElements(getDriver(), LoginPage_Page.class);

		}

		return driver;

	}

	public static void letsWait(int val) {

		try {
			Thread.sleep(val);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	
	public static void clickTheButtonByjsExecuterMethod(WebElement ele) {
		
		js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele);

		

	}

}
