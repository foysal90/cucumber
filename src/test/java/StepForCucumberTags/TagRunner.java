package StepForCucumberTags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions 
(
		features = "src/test/resources/cucumberTags/tagsDemo.feature",
		glue = {"StepForCucumberTags"},
		monochrome = true,
		plugin = {"pretty", "html:Reports/tagreport.html"},
		tags = "@smoke or @regression"
//		tags = "@mustRun"
//		tags = "@smoke and  @regression",
//		tags = "@smoke and not @regression"
//		tags = "(@smoke or @regression) and not @important"
		

		)

public class TagRunner {

}
