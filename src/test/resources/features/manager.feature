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
      And fill edit details form
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
            And fill  details form
            And account  should updated
