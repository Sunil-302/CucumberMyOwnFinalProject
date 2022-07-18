package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashBoard_Page;
import pageObjects.LoginPage_Page;
import utils.BaseFile;

public class DashBoard extends BaseFile {
	
	


	

	@Given("The User is on the DashBoard page")
	public void the_user_is_on_the_dash_board_page() {
		
		

		getDriver().get("https://riversidescore.com/");
//		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("ProdAllOrg04.(Primary)");
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Test@100");
//		driver.findElement(By.xpath("//input[@class=\"login-button\"]")).click();

		

		lpage.userNameField("ProdAllOrg04.(Primary)");
		lpage.passwordField("Test@100");
		lpage.clickOnSignIn();

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		driver.findElement(By.xpath("//button[@class=\"product-display bdi-logo\"]")).click();

		lpage.clickOnBdi3Tyle();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	@When("We should be navigating to AddExaminee page")
//	public void we_should_be_navigating_to_add_examinee_page() {
//
//		dpage = new DashBoard_Page(driver);
//
//		dpage.clickOnChildAdministatonButton();
//
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		dpage.clickOnAddChild();
//		try {
//			Thread.sleep(800);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	@When("We will try to give all the necessary details and click on SAVE button")
	public void we_will_try_to_give_all_the_necessary_details_and_click_on_save_button() {

		driver.findElement(By.xpath("//input[@placeholder=\"Enter child first name\"]")).sendKeys("autoChild");

		driver.findElement(By.xpath("//input[@placeholder=\"Enter child last name\"]")).sendKeys("byPAh");

		driver.findElement(By.xpath("(//button[@class=\"select-box\"])[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()=\"Male\"]")).click();

		driver.findElement(By.xpath("(//input[@class=\"text-input with-icon\"])[1]")).sendKeys("07/02/2018");

		driver.findElement(By.xpath("//div[text()=\"Select location\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()=\"ProdAllOrg04\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("we should be able to see the SAVED SUCCESSFUL pop up")
	public void we_should_be_able_to_see_the_saved_successful_pop_up() {
		driver.findElement(By.xpath("//input[@value=\"OK\"]")).click();

	}

	@Then("page will navigate itself to the Child info page")
	public void page_will_navigate_itself_to_the_child_info_page() {
		System.out.println(driver.getTitle());

		assertEquals(driver.getTitle(), "Child Information");
	}

}
