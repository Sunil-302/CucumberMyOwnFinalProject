package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BaseFile;

public class Hooks extends BaseFile {

	@After
	public void tearDown() {
		driver.quit();
		driver = null;

	}

	@Before
	public void tearup() {

		getDriver();
	}

	@AfterStep

	public void takeScreenShot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");

		}

	}

}
