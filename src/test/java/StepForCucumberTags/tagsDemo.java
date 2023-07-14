package StepForCucumberTags;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagsDemo {

	WebDriver driver;

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("browser setUp")
	public void browser_set_up() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://islahiart.com/");
	}

	@When("put islahi login credentials and click on login button")
	public void put_islahi_login_credentials_and_click_on_login_button() throws InterruptedException {

		driver.findElement(By.xpath("(//*[name()='path'])[7]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='xoo-el-login-tgr xoo-el-active'][normalize-space()='Login'])[1]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.name("xoo-el-username")).sendKeys("ahmef2370@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("123456");

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='xoo-el-rememberme'])[1]")).click();

		driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Sign In'])[1]")).click();

		Thread.sleep(3000);
	}

	@Then("user must be navigated to Home page")
	public void user_must_be_navigated_to_home_page() {

		String actualURL = driver.getCurrentUrl();

		System.out.println("Actual URL After user sucessfully logged in : " + actualURL);

		String expectedURL = "https://islahiart.com/my-account/?login=success";

		Assert.assertEquals(actualURL, expectedURL);
		if (actualURL.equalsIgnoreCase(expectedURL)) {
			System.out.println("user successfully logged in");
		} else {
			System.out.println("Error occured and  login failed");
		}

	}

	@When("user click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		   driver.findElement(By.xpath("(//*[name()='path'])[7]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[text()='Sign Up']")).click();
	}

	@Then("user must be navigated to sign in page")
	public void user_must_be_navigated_to_sign_in_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("email");
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("fname");
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("lname");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]")).sendKeys("pwd");
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@placeholder='Confirm Password'])[1]")).sendKeys("cpwd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='xoo_el_reg_terms'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign Up'])[1]")).click();
        Thread.sleep(3000);
	}

}
