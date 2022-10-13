package org.example.pageActions;

import org.example.pageElements.AddNewCustomerElements;
import org.example.pageElements.DeleteCustomerElements;
import org.example.pageElements.EditCustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerActions {
    WebDriver driver;
    DeleteCustomerElements deleteCustomerElements;

    public DeleteCustomerActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
        deleteCustomerElements = new DeleteCustomerElements(driver);

    }
    public void clickOnDeleteCustomer() throws InterruptedException {
        deleteCustomerElements.deleteCustomer.click();
        Thread.sleep(2000);
    }
    public void enterCustomerId(){deleteCustomerElements.customerId.sendKeys("62048");
        deleteCustomerElements.submit.click();
        }
}
