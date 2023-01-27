Feature: Company Creation Functionality
  @Positive
  Scenario: TC1 Ensure successfully creating new company with filling complete information
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    When user clicks on create new company button
    And user fills company name
    And user fills company description
    And user clicks create button
    Then company successfully created

  @Negative
  Scenario: TC2 Failed in creating Company with null information
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    When user clicks on create new company button
    And user clicks create button
    Then user is notified field must filled

  @Negative
  Scenario: TC3 Failed in creating new company with null name
      Given user is at application homepage
      And user clicks skip button
      And user clicks Go to sign in button
      And user clicks login with Google Account
      And user clicks the selected Google Account
      When user clicks on create new company button
      And user fills company description
      And user clicks create button
      Then user is notified field must filled

  @Negative
  Scenario: TC4 Failed in creating new company with null description
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    When user clicks on create new company button
    And user fills company name
    And user clicks create button
    Then user is notified field must filled

  @Negative
  Scenario: TC5 Failed creating new company when user clicks close button
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    When user clicks on create new company button
    And user fills company name
    And user fills company description
    And user clicks close button on company creation page
    Then user is directed to application homepage