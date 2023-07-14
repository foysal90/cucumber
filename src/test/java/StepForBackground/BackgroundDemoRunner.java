package StepForBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions (features="src/test/resources/BackgroundDemo/backgroundDemo.feature",
glue = {"StepForBackground"},
monochrome = true,
plugin = {"pretty", "html:Reports/backgroundDemo.html"}
)


public class BackgroundDemoRunner {

}
