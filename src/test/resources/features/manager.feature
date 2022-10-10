@Manager
Feature: this is manager feature
  Scenario: Login with valid credentials 1
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And fill customer details form
    And customer should added
