package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class googleSearchSteps {

	WebDriver driver;

	
	@Given ("browser is open")
	public void setBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@And ("user is on google search page")
	public void searchPage() {
		driver.get("http://google.com");
	}

	@When ("user enters a text in google search box")
	public void searchContent() {
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

	@And ("hits enter")
	public void clickOnSearch() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Then ("user is navigated to search result page")
	public void verifyPage() {
	String text =driver.getPageSource();
	System.out.println(text.contains("Selenium"));
		System.out.println("just checking");
		driver.quit();
	}


}
