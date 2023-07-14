package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {


	@Given("user is login page")
	public void user_is_login_page() {
		System.out.println("hello login page");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("hello user and password");
		
	
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("hello login button");
		
		
	}

	@Then("user is navigated to the dashboard or Home page")
	public void user_is_navigated_to_the_dashboard_or_home_page() {
		System.out.println("hello home page");
		
	}



}
