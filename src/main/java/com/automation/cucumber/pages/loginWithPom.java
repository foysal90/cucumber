package com.automation.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginWithPom {
	
	protected WebDriver driver;
	
	public loginWithPom(WebDriver driver) {
		this.driver = driver;
		
	}
	
	private By username_login = By.id("email");
	private By user_password = By.id("pass");
	private By loginButton = By.name("login");
	
	
	public void loginT(String username, String password) {
		driver.findElement(username_login).sendKeys(username);
		
		driver.findElement(user_password).sendKeys(password);
		driver.findElement(loginButton).click();
		
	}
	
//	public void button() {
//		driver.findElement(loginButton).click();
//	}
//	

}
