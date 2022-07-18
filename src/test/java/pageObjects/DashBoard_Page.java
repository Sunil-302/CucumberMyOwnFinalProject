package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseFile;

public class DashBoard_Page extends BaseFile{
	
	//public WebDriver driver;

	public DashBoard_Page() {
		//this.driver = driver;
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//button[@class='menu-item menu-teal']")
	WebElement btnChildAdministration;

	@FindBy(xpath = "//button[text()=\"Add Child\"]")
	WebElement btnAddChild;
	
	
	
	

	/* =========================METHODS========================== */

	public void clickOnChildAdministatonButton() {
		btnChildAdministration.click();

	}
	
	public void clickOnAddChild() {
		btnAddChild.click();

	}

}
