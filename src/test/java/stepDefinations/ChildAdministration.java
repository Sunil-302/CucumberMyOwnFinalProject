package stepDefinations;

import io.cucumber.java.en.When;
import pageObjects.DashBoard_Page;
import pageObjects.LoginPage_Page;
import utils.BaseFile;

public class ChildAdministration extends BaseFile {


	


	@When("We should be navigating to AddExaminee page")
	public void we_should_be_navigating_to_add_examinee_page() {

		dpage.clickOnChildAdministatonButton();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dpage.clickOnAddChild();
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
