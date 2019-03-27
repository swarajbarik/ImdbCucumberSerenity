package com.imdb.cucumbertest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.imdb.cucumbertest.steps.serenity.EndUserSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;;
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/testdata.csv")
public class RegistrationWithExcelDataStepDef {

	private String name;
	private String email;
	private String password;
	private String confirmpassword;
	private String expectedresult;

	public RegistrationWithExcelDataStepDef() {
	}

	@Managed
	public WebDriver webdriver;

	@Steps
    EndUserSteps anna;

	@Test
	public void data_driven_test() {
		anna.is_the_home_page();
		anna.clickOnSignInButton();
		anna.clickOnCreateNewAccoutButton();
		anna.providesDetails(getName(), getEmail(), getPassword(), getConfirmPassword());
		anna.clickonCreateImdbAccount();
		anna.verifyLoggedInUser(getExpectedresult());
		anna.clicksOnSignOut();
		anna.clickOnSignInButton();
		anna.clickonSignInWithImdb();
		anna.insertLoginDetails(getEmail(), getPassword());
		anna.clickonSignInSubmitButton();
		anna.verifyLoggedInUser(getExpectedresult());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmpassword;
	}

	public void setConfirmPassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getExpectedresult() {
		return expectedresult;
	}

	public void setExpectedresult(String expectedresult) {
		this.expectedresult = expectedresult;
	}
}