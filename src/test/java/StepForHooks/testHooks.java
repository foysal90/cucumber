package StepForHooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testHooks {

	WebDriver driver;
	
	//it will be executed before the tests

	@Before (value="@smoke", order=1)
	public void browserSetUp() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}
	
	//before step will execute in every test
	@BeforeStep
	public void beforeStepsDemo() {
		System.out.println("this is before step");
	}
	
     // it will be executed after the tests
	@After
	public void CloseHooks() {

		driver.quit();
	}
	
	//after step will execute in every test
	@AfterStep
	public void afterStepsDempo()
	{
		System.out.println("this is after step demo");
	}
	@Given("user is on login page")
	public void hookLoginTest() {
		driver.get("http://facebook.com");

	}

	@Then("user enters invalid credrntials")
	public void userCredentialsHooks() {

		driver.findElement(By.id("email")).sendKeys("fuihiuhrg");
		driver.findElement(By.id("pass")).sendKeys("0561945619");
		driver.findElement(By.name("login")).click();
		;

	}

	@Then("browser close Hooks")
	public void verfyTest() {
		System.out.println("success");
	}

}
