package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.example.pageActions.*;
import org.openqa.selenium.WebDriver;

public class ManagerSteps {
    WebDriver driver;
    AddNewCustomerActions addNewCustomerActions;
    EditCustomerActions editCustomerActions;
    DeleteCustomerActions deleteCustomerActions;

    CreateNewAccountActions createNewAccountActions;
    EditAccountActions editAccountActions;


    public ManagerSteps(CommonSteps commonSteps, AddNewCustomerActions addNewCustomerActions,EditCustomerActions editCustomerActions
                       ,DeleteCustomerActions deleteCustomerActions,CreateNewAccountActions createNewAccountActions,
                        EditAccountActions editAccountActions) {
        this.driver = commonSteps.getDriver();
        this.addNewCustomerActions = addNewCustomerActions;
        this.editCustomerActions = editCustomerActions;
        this.deleteCustomerActions = deleteCustomerActions;
        this.createNewAccountActions= createNewAccountActions;
        this.editAccountActions = editAccountActions;
    }
    @When("i navigate to new fill new customer form")
    public void i_navigate_to_new_fill_new_customer_form() throws InterruptedException {
        addNewCustomerActions.clickOnAddNewCustomer();
        Thread.sleep(2000);
    }
    @When("fill customer details form")
    public void fill_customer_details_form() throws InterruptedException {
        addNewCustomerActions.fillAddNewForm();
    }
    @When("customer should added")
    public void customer_should_added() {

    }
    @When("i navigate to edit customer form")
    public void i_navigate_to_edit_customer_form() throws InterruptedException {
        editCustomerActions.clickOnEditCustomer();
        editCustomerActions.enterCustomerId();
    }



    @When("customer should updated")
    public void customer_should_updated() {

    }

    @When("i navigate to delete customer form")
    public void i_navigate_to_delete_customer_form() throws InterruptedException {
        deleteCustomerActions.clickOnDeleteCustomer();
        deleteCustomerActions.enterCustomerId();
    }
    @When("customer should deleted")
    public void customer_should_deleted() {

    }
    @When("i navigate to new account")
    public void i_navigate_to_new_account() throws InterruptedException {
        createNewAccountActions.clickOnCreateNewAccount();
    }
    @When("fill  details form")
    public void fill_details_form() {
        createNewAccountActions.fillAccountDetail();
    }
    @When("account  should created")
    public void account_should_created() {

    }

    @When("i navigate to edit account")
    public void i_navigate_to_edit_account() throws InterruptedException {
        editAccountActions.clickOnEditAccount();
        Thread.sleep(2000);
        editAccountActions.enterAccountId();


    }
    @When("account  should updated")
    public void account_should_updated() {

    }

}
