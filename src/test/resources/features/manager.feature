@Manager
Feature: this is manager feature
  @SC01
  Scenario: Login with valid credentials 1 Add new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And fill customer details form
    And customer should added

  @SC02
  Scenario:  Edit customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to edit customer form
    And fill  details form
    And customer should updated

  @SC03
  Scenario: Delete customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to delete customer form
    And customer should deleted

  @SC04
  Scenario: New Account
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new account
    And fill  details form
    And account  should created


    @SC05
    Scenario: Edit Account
      Given I open application url in browser
      And I navigate to login page
      When Enter I enter 'mngr446232', 'syqUtUz' and click on login
      And Login should be successful
      And i navigate to edit account
      And account  should updated

    @SC06
    Scenario: Invalid first name Add new customer
      Given I open application url in browser
      And I navigate to login page
      When Enter I enter 'mngr446232', 'syqUtUz' and click on login
      And Login should be successful
      And i navigate to new fill new customer form
      And Numbers are not allowed at name
      And customer should added

    @SC07
    Scenario:  Special characters are not allowed Add new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And Special characters are not allowed
    And customer should added

  @SC08
  Scenario:  Customer name must not be blank Add new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And Customer name must not be blank
    And customer should added

  @SC09
  Scenario:  First character cannot have space Add new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And  First character cannot have space
    And customer should added

  @SC010
  Scenario:  Address Field must not be blank Add new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And  Address Field must not be blank
    And customer should added

  @SC011
  Scenario:  First character can not have space Add new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And  First character can not have space
    And customer should added

  @SC012
  Scenario:  Special characters are not allowed in address field new customer
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'mngr446232', 'syqUtUz' and click on login
    And Login should be successful
    And i navigate to new fill new customer form
    And  Special characters are not allowed at address field
    And customer should added
