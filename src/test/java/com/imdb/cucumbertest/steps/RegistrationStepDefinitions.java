package com.imdb.cucumbertest.steps;

import com.imdb.cucumbertest.steps.serenity.EndUserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationStepDefinitions {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the IMDB home page")
    public void givenTheUserIsOnIMDBHomePage() {
        anna.is_the_home_page();
    }

    @Then("the user moves the mouse to MoviesTvShows")
    public void thenUserMovesMousetoMoviesAndTvShows() {
    	anna.moves_mouse_to_moviesandtvshows();
    }

    @And("the user clicks on Most Popular TV Shows link")
    public void andUserClickedOnMostPopularTvShows() {
    	anna.clickedon_most_popular_tv_shows();
    }
    
    @Then("the user should verify the ratings")
    public void thenUserShouldVerifyTheRatings() {
    	anna.verify_ratings(9.5);
    }
    
    @Then("the user clicks on Game of thrones link")
    public void thenUserClicksOnGameOfThrones() {
    	anna.clickon_game_of_thrones();
    }
    
    @Then("the user should verify the Game of thrones description page")
    public void thenUserVerifyGameOfThronesDescriptionPage() {
    	anna.verify_show_description("Game of Thrones");
    }
}
