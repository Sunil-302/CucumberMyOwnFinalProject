package stepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseFile;

public class RoboClass extends BaseFile {

	public static Robot robot;

	@Given("i will be at the monstor.com page")
	public void i_will_be_at_the_monstor_com_page() {
		getDriver().get("https://www.monsterindia.com/");

		letsWait(2000);

	}

	@When("i will click on Upload Resume button")
	public void i_will_click_on_upload_resume_button() {

		letsWait(1000);
		mCom.clickOnUploadResumeButton();
		letsWait(2000);

	}

	@When("i using SendKeys method i will upload the file")
	public void i_using_send_keys_method_i_will_upload_the_file() {

		letsWait(1000);

		mCom.uploadTheFollowinfFile("D:\\Software Engineer\\Path.docx");

		letsWait(2000);

	}

	@When("i will click on the SelectFileToUpload button")
	public void i_will_click_on_the_select_file_to_upload_button() {
		letsWait(1000);
		mCom.clickOnSelectFileToUploadButton();

		letsWait(3000);

	}

	@Then("i will handle to rest with RoboClass")
	public void i_will_handle_to_rest_with_robo_class() {

		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		letsWait(2000);

		StringSelection ss = new StringSelection("D:\\Software Engineer\\Path.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		robot.delay(300);		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);

		letsWait(3000);

	}

}
