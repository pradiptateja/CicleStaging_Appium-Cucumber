Feature: Card Functionality
  @Negative
  Scenario: TC1 Ensure user failed to create card with null name
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks Add new card
    And user clicks checklist button
    Then user cannot see the created card

  @Positive
  Scenario: TC2 Ensure user successfully create card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks Add new card
    And user input card name
    And user clicks checklist button
    Then user can see the created card

  @Positive
  Scenario: TC3 Ensure user successfully create private card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks Add new card
    And user input private card name
    And user switch on the private option
    And user clicks checklist button
    Then user can see the created card

  @Positive
  Scenario: TC4 Ensure user successfully archive existing private card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks private card
    And user clicks card option on card
    And user clicks Archive Card
    And user clicks Archive button confirmation
    Then user can see archive success notification


  @Positive
  Scenario: TC5 Ensure user successfully make existing public card to be private
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks one card
    And user clicks card option on card
    And user clicks Set card to private
    And user clicks phone back button
    Then user see notification card status updated

  @Positive
  Scenario: TC6 Ensure user successfully make existing private card to be public
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks one card
    When user clicks card option on card
    And user clicks Set card to public
    Then user see notification card status updated

  @Positive
  Scenario: TC7 Ensure user successfully move card to another list
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user get all card on list
    When user clicks one card
    And user clicks card option on card
    And user clicks move card
    And user clicks List choices
    And user clicks other List
    And user clicks done button on Move Card page
    Then user can see different amount of card on List

  @Positive
  Scenario: TC8 Ensure user successfully move card to another list via drag and drop
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user get all card on list
    And user hold-drag-drop card to another list
    Then user can see different amount of card on List

  @Positive
  Scenario: TC9 Ensure user is notified under development when copy card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    When user clicks one card
    When user clicks card option on card
    And user clicks copy card
    Then user can see under development notification


