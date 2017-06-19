package com.samsung.tests;

import org.junit.Assert;
import org.junit.Test;

import com.samsung.pages.AccountPage;
import com.samsung.pages.HomePage;

public class SamsungPageTests extends BaseTestSuite {

	@Test
	public void testVerifyEmailError() {
		String expectedEmailError = "Please enter a valid Email.";

		HomePage homePage = new HomePage(driver);
		homePage.clickSignupLink();

		AccountPage accountPage = new AccountPage(driver);
		accountPage.setEmail("bootcamp@bootcamp");
		accountPage.clickContinueButton();
		String actualEmailError = accountPage.getEmailError();
		Assert.assertEquals("Verify Email error", actualEmailError, expectedEmailError);

	}

	//@Test
	public void testPasswordMismatchError() {
		String expectedConfirmPasswordError = "Password does not match.";
		HomePage homePage = new HomePage(driver);
		homePage.clickSignupLink();

		AccountPage accountPage = new AccountPage(driver);
		accountPage.setEmail("bootcamp@bootcamp.com");
		accountPage.setPassword("Antelope007!");
		accountPage.setConfirmPassword("Ostrich007!");
		accountPage.clickContinueButton();
		String actualConfirmPasswordError = accountPage.getConfirmPasswordError();
		Assert.assertEquals("Verify ConfimPassword error", actualConfirmPasswordError, expectedConfirmPasswordError);

	}

}
