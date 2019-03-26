Feature: Verify the Registration Test Case

  Scenario: Verify Registration Test Case
    Given the user is on the IMDB home page
    When the user clicked on signin button
    Then the user clicked on create a new accout button
    Then the user inserts 'swaraj','swarajbarik07@gmail.com','swaraj123','swaraj123'
    Then the user clicks on create your IMDB account
    Then the user verifies the name 'swaraj'
    Then the user clicks on signout
    Then the user clicked on signin button
    Then the user clicks on SignIn with IMDB
    Then the user inserts login details 'swarajbarik07@gmail.com','swaraj123'
    Then the user clicks on SigninSubmit button
    Then the user verifies the name 'swaraj'
