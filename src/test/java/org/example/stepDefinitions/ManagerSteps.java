package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.example.pageActions.AddNewCustomerActions;
import org.openqa.selenium.WebDriver;

public class ManagerSteps {
    WebDriver driver;
    AddNewCustomerActions addNewCustomerActions;

    public ManagerSteps(CommonSteps commonSteps, AddNewCustomerActions addNewCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.addNewCustomerActions = addNewCustomerActions;
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

}
