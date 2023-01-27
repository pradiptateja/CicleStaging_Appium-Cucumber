Feature: Welcome Page Functionality
  @Positive
  Scenario: TC1 Ensure user successfully accesses the login page via skip button
    Given user is at application homepage
    When user clicks skip button
    Then user can access the login page

  @Positive
  Scenario: TC2 Ensure user successfully accesses the login page via swipe method
    Given user is at application homepage
    When user clicks yes button
    And user swipe the screen on loop
    Then user can access the login page