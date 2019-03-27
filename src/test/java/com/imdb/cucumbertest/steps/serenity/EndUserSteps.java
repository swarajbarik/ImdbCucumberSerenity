package com.imdb.cucumbertest.steps.serenity;

import com.imdb.cucumbertest.pages.ImdbHomePage;
import com.imdb.cucumbertest.pages.RegistrationPage;
import com.imdb.cucumbertest.pages.ShowDescriptionPage;

import net.thucydides.core.annotations.Step;

public class EndUserSteps {

    ImdbHomePage imdbHomePage;
    ShowDescriptionPage showDescriptionPage;
    RegistrationPage registraionPage;
  
    @Step
    public void is_the_home_page() {
        imdbHomePage.open();
        imdbHomePage.getDriver().manage().window().maximize();
    }

    @Step
	public void moves_mouse_to_moviesandtvshows() {
    	imdbHomePage.move_mouse();
	}

    @Step
	public void clickedon_most_popular_tv_shows() {
    	imdbHomePage.clickOn(imdbHomePage.mostPopularTvShows);
	}

    @Step
	public void verify_ratings(double d) {
    	imdbHomePage.verifyRatings(d);
	}

    @Step
	public void clickon_game_of_thrones() {
    	imdbHomePage.clickOn(imdbHomePage.showName);
	}

    @Step
	public void verify_show_description(String sName) {
    	showDescriptionPage.verifyShowDescription(sName);
	}

    @Step
	public void clickOnSignInButton() {
    	imdbHomePage.clickOn(imdbHomePage.signInButton);
	}

    @Step
	public void clickOnCreateNewAccoutButton() {
    	registraionPage.clickOn(registraionPage.createNewAccoutButton);
	}

    @Step
	public void providesDetails(String name, String email, String password, String repass) {
    	registraionPage.typeInto(registraionPage.name, name);
    	registraionPage.typeInto(registraionPage.email, email);
    	registraionPage.typeInto(registraionPage.password, password);
    	registraionPage.typeInto(registraionPage.repass, repass);
    	
	}

    @Step
	public void clickonCreateImdbAccount() {
    	registraionPage.clickOn(registraionPage.createAccount);
	}

    @Step
	public void verifyLoggedInUser(String name) {
    	registraionPage.verifyLoggedInUser(name);
	}

    @Step
	public void clicksOnSignOut() {
    	registraionPage.signOut();
	}

    @Step
	public void clickonSignInWithImdb() {
		registraionPage.clickOn(registraionPage.signInWithImdb);
	}

    @Step
	public void insertLoginDetails(String email, String password) {
		registraionPage.typeInto(registraionPage.email, email);
    	registraionPage.typeInto(registraionPage.password, password);		
	}

    @Step
	public void clickonSignInSubmitButton() {
    	registraionPage.clickOn(registraionPage.signInSubmitButton);
	}
}