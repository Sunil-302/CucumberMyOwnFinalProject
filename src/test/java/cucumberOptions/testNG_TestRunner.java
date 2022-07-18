package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",
		monochrome=true,
//		dryRun=true,
		tags="@mCom",
		plugin= {"html:terget/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedScenarios/failed_scenarios.txt"}
)

public class testNG_TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
