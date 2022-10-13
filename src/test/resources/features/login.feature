@login
Feature: this is login feature

  @SC1
  Scenario: Login with valid credentials 1
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter "mngr446232", "syqUtUz" and click on login
    Then Login should be successful

    @SC2
    Scenario: Login with invalid userId
      Given I open application url in browser
      And I navigate to login page
      When enter invalidId
      Then log in should fail

  @SC3
  Scenario: Login with invalid userPassword
    Given I open application url in browser
    And I navigate to login page
    And enter valid userId "mngr446232"
    When enter invalidPassword
    Then log in should fail