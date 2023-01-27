Feature: Team Creation Functionality
  @Positive
  Scenario: TC1 Ensure user successfully create new Team
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks company add features button
    And user clicks Add new team button
    And user inputs team name
    And user inputs team description
    And user clicks create button
    Then team is successfully created

  @Negative
  Scenario: TC2 Failed in creating new team with null information
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks company add features button
    And user clicks Add new team button
    And user clicks create button
    Then user is notified field must filled

  @Negative
  Scenario: TC3 Failed in creating new team with null name
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks company add features button
    And user clicks Add new team button
    And user inputs team description
    And user clicks create button
    Then user is notified field must filled

  @Negative
  Scenario: TC4 Failed in creating new team with null description
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks company add features button
    And user clicks Add new team button
    And user inputs team name
    And user clicks create button
    Then user is notified field must filled

  @Negative
  Scenario: TC5 Failed in creating new team when clicking close button
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks company add features button
    And user clicks Add new team button
    And user inputs team name
    And user inputs team description
    And user clicks close button on team creation page
    And user clicks phone back button
    Then user is directed to company page