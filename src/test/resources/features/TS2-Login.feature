Feature: Login Functionality
  @Positive
  Scenario: TC1 Ensure user successfully logged in using Google Account
    Given user is at application homepage
    And user clicks skip button
    When user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    Then user is directed to application homepage
    And user can see Tab Container