Feature: Board Functionality
  @Positive
  Scenario: TC1 Ensure user successfully deactivate, TC2 reactive board feature
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks settings button
    And user clicks edit menu button
    And user switch off board button
    And user clicks save button
    And user swipe the screen right
    Then user cannot see board feature
    When user clicks settings button
    And user clicks edit menu button
    And user switch on board button
    And user clicks save button
    And user swipe the screen right
    Then user can see board feature

  @Negative
  Scenario: TC3 Ensure user failed to deactivate without clicking save
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks settings button
    And user clicks edit menu button
    And user switch off board button
    And user swipe the screen right
    Then user can see board feature

  @Positive
  Scenario: TC4 Ensure user successfully create list
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user clicks add List button
    And user input List name
    And user clicks submit button
    Then user can see the created List

  @Negative
  Scenario: TC5 Ensure user failed to create List without filling name List
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user clicks add List button
    And user clicks submit button
    Then user cannot see the created List

  @Positive
  Scenario: TC6 Ensure user successfully create more list
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user clicks add List button
    And user input another List name
    And user clicks submit button
    Then user can see the two created Lists

  @Positive
  Scenario: TC7 Ensure user successfully archive list
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user clicks List option button
    And user clicks Archive button
    Then user cannot see the archived List

  @Positive
  Scenario: TC8 Ensure user successfully unarchive list
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user clicks archive menu
    And user clicks list archive option
    And user clicks restore button
    And user clicks OK button
    And user swipe the screen right
    Then user can see the archived list on Board

  @Positive
  Scenario: TC9 Ensure user successfully marking list as complete
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user clicks List option button
    And user clicks Complete button
    Then user can see green symbol in List name

  @Positive
  Scenario: TC10 Ensure user successfully reorder List
    Given user is at application homepage
    And user clicks skip button
    And user clicks Go to sign in button
    And user clicks login with Google Account
    And user clicks the selected Google Account
    And user clicks the existing company
    When user clicks the existing team
    And user clicks team board feature
    And user gets the current list order
    And user change the list order by hold-drag-drop
    And user swipe the screen right
    Then user can see the changed list order
