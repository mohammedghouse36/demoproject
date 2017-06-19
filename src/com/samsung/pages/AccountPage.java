package com.samsung.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
	
	protected WebDriver driver;
	
	String emailElement = "input[id*=EmailID]";
	String passwordElement = "input[id*=inputPassword]";
	String confirmPasswordElement = "input[id*=InputPassword]";
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setEmail(String email) {
		driver.findElement(By.cssSelector(emailElement)).sendKeys(email);
	}
	
	public void clickContinueButton() {
		driver.findElement(By.id("btnSubmit")).click();
	}
	
	public String getEmailError() {
		return driver.findElement(By.cssSelector(emailElement + "+" +"label")).getText();
	}
	
	public void setPassword(String password) {
		driver.findElement(By.cssSelector(passwordElement)).sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmPassword) {
		driver.findElement(By.cssSelector(confirmPasswordElement)).sendKeys(confirmPassword);
	}
	
	public String getConfirmPasswordError() {
		return driver.findElement(By.cssSelector(confirmPasswordElement + "+" +"label")).getText();
	}
	

}
