package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseFile;

public class LoginPage_Page extends BaseFile {

//	public WebDriver driver;

	public LoginPage_Page() {
//		this.driver = driver;
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@class=\"login-button\"]")
	WebElement btnLogin;
	
	@FindBy(xpath = "//button[contains(@aria-label,\"Battelle Development Inventory 3\")]")
	WebElement btnBdiTyle;
	
	

	/* =========================METHODS========================== */

	public void userNameField(String val) {
		txtUsername.sendKeys(val);

	}

	public void passwordField(String val) {
		txtPassword.sendKeys(val);

	}

	public void clickOnSignIn() {
		btnLogin.click();

	}
	
	public void clickOnBdi3Tyle() {
		btnBdiTyle.click();

	}

}
