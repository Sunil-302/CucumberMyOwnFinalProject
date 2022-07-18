package pageObjects;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseFile;

public class Monster_com_Page extends BaseFile {

	

	@FindBy(xpath = "//a[contains(@class,\"btn block resume-btn btn\")]")
	WebElement btnUploadResume;

	@FindBy(xpath = "(//input[@id='file-upload'])[1]")
	WebElement inpSelectFileToUpload;

	public void clickOnUploadResumeButton() {
		letsWait(1000);
		btnUploadResume.click();

	}

	public void uploadTheFollowinfFile(String file) {

		inpSelectFileToUpload.sendKeys(file);

	}

	public void clickOnSelectFileToUploadButton() {

		clickTheButtonByjsExecuterMethod(inpSelectFileToUpload);

	}

}
