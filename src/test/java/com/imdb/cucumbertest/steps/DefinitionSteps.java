package com.imdb.cucumbertest.steps;

import com.imdb.cucumbertest.steps.serenity.EndUserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

   
    @When("the user clicked on signin button")
    public void theUserClickOnSignInButton() {
    	anna.clickOnSignInButton();
    }
    @Then("the user clicked on create a new accout button")
    public void theUserClickOnCreateNewAccoutButton() {
    	anna.clickOnCreateNewAccoutButton();
    }
    @Then("the user inserts '(.*)','(.*)','(.*)','(.*)'")
    public void theUserInsertsDetails(String name, String email, String password, String repass) {
    	anna.providesDetails(name,email, password,repass);
    }
    @Then("the user clicks on create your IMDB account")
    public void theUserIsOnCreateImdbAccount() {
    	anna.clickonCreateImdbAccount();
    }
    @Then("the user verifies the name '(.*)'")
    public void theUserVerifiesTheName(String name) {
    	anna.verifyLoggedInUser(name);
    }
    @Then("the user clicks on signout")
    public void theUserClicksOnSignOut() {
    	anna.clicksOnSignOut();
    }
   
    @Then("the user clicks on SignIn with IMDB")
    public void theUserClicksOnSignInWithImdb() {
    	anna.clickonSignInWithImdb();
    }
    @Then("the user inserts login details '(.*)','(.*)'")
    public void theUserProvidesCredentials(String email,String password) {
    	anna.insertLoginDetails(email, password);
    }
    @Then("the user clicks on SigninSubmit button")
    public void theUserClicksOnSignInSubmitButton() {
    	anna.clickonSignInSubmitButton();
    }

}
