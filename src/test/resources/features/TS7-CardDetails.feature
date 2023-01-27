Feature: Card Details Functionality
  @Positive
  Scenario: TC1 Ensure user successfully rename existing card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user clicks edit card name button
    And user input new card name
    And user clicks save button to rename the card
    Then user can see the new name appearing

  @Positive
  Scenario: TC2 Ensure user successfully create label
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user clicks add label
    And user input label name
    And user pick one color for the label
    And user clicks submit button for the label
    Then user can see the created label

  @Positive
  Scenario: TC3 Ensure user successfully apply label to the card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user clicks add label
    And user chooses existing label
    Then user is notified label has applied

  @Positive
  Scenario: TC4 Ensure user successfully remove label from the card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user clicks remove label from card
    Then user cannot see the removed label on card

  @Positive
  Scenario: TC5 Ensure user successfully delete label
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user clicks add label
    And user clicks delete button on existing label
    And user clicks delete to confirm delete label
    Then user cannot see the deleted label

  @Positive
  Scenario: TC6 Ensure user successfully add description to card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user click edit card description button
    And user touch field
    And user touch keyboard for any typing
    And user clicks phone back button
    And user clicks publish button
    Then user is notified success update notes

  @Positive
  Scenario: TC7 Ensure user successfully add comment to card
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user click add comments button
    And user touch the input comment field
    And user touch keyboard for any typing
    And user clicks phone back button
    And user clicks submit for adding comments
    Then user scroll down until can see the comment

  @Positive
  Scenario: TC8 Ensure user successfully add cheers to comment, TC9 Ensure user successfully delete cheers
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user scroll down until can see the comment
    And user clicks on cheers button
    And user input text for cheers
    And user clicks done to save the cheers
    Then user can see the cheers given
    When user click the added cheers
    And user clicks delete button on cheers
    Then user cannot see the deleted cheers

  @Positive
  Scenario: TC10 Ensure user successfully archiving comment
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    And user clicks the existing team
    And user clicks team board feature
    And user clicks one card
    When user scroll down until can see the comment
    And user clicks on comment menu
    And user clicks archive comment
    And user clicks OK button
    Then user is notified comment has been archived
