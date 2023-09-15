package in.preschool.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//preschol.feature",
		glue = "in.preschool.teststeps",
		//tags = "TC_101"
		tags="@find_preschool"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
