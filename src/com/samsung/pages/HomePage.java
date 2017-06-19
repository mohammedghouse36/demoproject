package com.samsung.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	protected WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignupLink() {
		driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.cssSelector("a[href*=signUp]"));
	}

}
