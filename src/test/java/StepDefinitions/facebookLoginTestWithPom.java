package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.cucumber.pages.loginWithPom;

import io.cucumber.java.en.*;

public class facebookLoginTestWithPom {
	 WebDriver driver;
	 loginWithPom login;
	@Given ("browser is getting open")
	public void SetBrowser1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@And ("user in on login page")
	public void userLoginPage() {
		
		driver.get("http://facebook.com");
	}
	@When ("^user enters(.*) and (.*)$")
	public void userCredentials(String username, String password) {
		
	   login = new loginWithPom(driver);
		login.loginT(username, password);
		

	}
	
//	@Then ("user is click on login button")
//	public void userLoginButton() {
//		login.button();
//	}
//	
	@Then ("user gets error msg with invalid credentials")
	public void errmsg() {
		String getText = driver.getPageSource();
		String actualText = "The email or mobile number you entered isn’t connected to an account.";
		System.out.println(getText.contains(actualText));
	}
	 
	
	
	@Then ("browser close")
	public void tearDown () {
		driver.quit();
	}

}
