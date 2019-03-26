Feature: Verify the Top Rated TV Shows

  Scenario: Verify Game of thrones
    Given the user is on the IMDB home page
    When the user moves the mouse to MoviesTvShows
    And the user clicks on Most Popular TV Shows link
    Then the user should verify the ratings
    Then the user clicks on Game of thrones link
    Then the user should verify the Game of thrones description page
