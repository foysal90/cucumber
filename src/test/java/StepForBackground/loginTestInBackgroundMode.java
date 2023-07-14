package StepForBackground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTestInBackgroundMode {
	
	WebDriver driver;

@Given("user should be in login page")
public void user_should_be_in_login_page() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/login");
}
    


@When("user put valid login data such as username and password")
public void user_put_valid_login_data_such_as_username_and_password() throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
    
    Thread.sleep(2000);
}

@Then("user must be navigate to dashboard")
public void user_must_be_navigate_to_dashboard() throws InterruptedException {
	
	WebElement admin =  driver.findElement(By.xpath("//div[@id='flash']"));
	//boolean verifyAdmin = admin.isDisplayed();
	String txt = admin.getText();
	
	System.out.println("test txt is :" + txt);
	String actualTxt ="You logged into a secure area!";
	
	if (txt.equalsIgnoreCase(actualTxt)) {
		System.out.println("Test passed");
		
	}
	else {
		System.out.println("Test failed");
	}
	
	Thread.sleep(2000);
	
	driver.quit();
	
    

}}
