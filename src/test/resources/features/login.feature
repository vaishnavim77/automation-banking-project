Feature: this is login feature
  Scenario: Login with valid credentials 1
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    Then Login should be successful