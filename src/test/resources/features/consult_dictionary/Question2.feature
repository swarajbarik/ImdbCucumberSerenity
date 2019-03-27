Feature: Verify the Registration Test Case

  Scenario Outline: Verify Registration Test Case
    Given the user is on the IMDB home page
    When the user clicked on signin button
    Then the user clicked on create a new accout button
    Then the user inserts '<name>','<email>','<password>','<confirm_password>'
    Then the user clicks on create your IMDB account
    Then the user verifies the name '<expected_result>'
    Then the user clicks on signout
    Then the user clicked on signin button
    Then the user clicks on SignIn with IMDB
    Then the user inserts login details '<email>','<password>'
    Then the user clicks on SigninSubmit button
    Then the user verifies the name '<expected_result>'
    
    Examples:
    |name|email|password|confirm_password|expected_result|
    |swaraj|swarajbarik07@gmail.com|swaraj123|swaraj123|swaraj|
