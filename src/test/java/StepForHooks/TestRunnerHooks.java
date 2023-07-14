package StepForHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",
monochrome = true,
plugin = {"pretty","html:Reports/hooksDemo.html"},
glue = {"StepForHooks"}
//{"pretty","html:target/cucumber.html"}
		
)

public class TestRunnerHooks {

	
}
