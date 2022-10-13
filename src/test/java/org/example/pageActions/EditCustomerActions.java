package org.example.pageActions;

import org.example.pageElements.AddNewCustomerElements;
import org.example.pageElements.EditCustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditCustomerActions {
    WebDriver driver;
    EditCustomerElements editCustomerElements;
    AddNewCustomerElements addNewCustomerElements;
    public EditCustomerActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
        editCustomerElements = new EditCustomerElements(driver);
        addNewCustomerElements = new AddNewCustomerElements(driver);
    }
    public void clickOnEditCustomer() throws InterruptedException {
        editCustomerElements.editCustomer.click();
        Thread.sleep(2000);
    }
    public void enterCustomerId(){editCustomerElements.customerId.sendKeys("62048");
    editCustomerElements.submit.click();
    addNewCustomerElements.submit.click();
    }
}
