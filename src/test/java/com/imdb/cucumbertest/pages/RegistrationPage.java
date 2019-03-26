package com.imdb.cucumbertest.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationPage extends PageObject {

	@FindBy(linkText = "Create a New Account")
	public WebElementFacade createNewAccoutButton;
	@FindBy(name = "customerName")
	public WebElementFacade name;
	@FindBy(name = "email")
	public WebElementFacade email;
	@FindBy(name = "password")
	public WebElementFacade password;
	@FindBy(name = "passwordCheck")
	public WebElementFacade repass;
	@FindBy(xpath = "//input[@id='continue']")
	public WebElementFacade createAccount;
	@FindBy(id = "nbusername")
	public WebElementFacade loggedInUser;
	@FindBy(id="nblogout")
	private WebElementFacade logout;
	@FindBy(xpath="//span[text()='Sign in with IMDb']")
	public WebElementFacade signInWithImdb;
	@FindBy(id="signInSubmit")
	public WebElementFacade signInSubmitButton;
	
	
	public void verifyLoggedInUser(String loggedInUserName) {
		String actualText = loggedInUser.getText();
		assertEquals(loggedInUserName, actualText);
	}



	public void signOut() {
		withAction().moveToElement(loggedInUser).build().perform();
		logout.click();
	}

}
