package org.example.pageActions;

import org.example.pageElements.AddNewCustomerElements;
import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddNewCustomerActions {
    private WebDriver driver;
    AddNewCustomerElements addNewCustomerElements;

    public AddNewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.addNewCustomerElements = new AddNewCustomerElements(driver);
    }
    public void clickOnAddNewCustomer(){
        addNewCustomerElements.newCustomer.click();
    }

    public void fillAddNewForm() throws InterruptedException {
        Thread.sleep(2000);
        addNewCustomerElements.customerName.sendKeys("Prisha");
        addNewCustomerElements.gender.click();
        addNewCustomerElements.dateOfBirth.sendKeys("10-09-2000");
        addNewCustomerElements.address.sendKeys("pimpple gurav");
        addNewCustomerElements.city.sendKeys("pune");
        addNewCustomerElements.state.sendKeys("maharastra");
        addNewCustomerElements.pincode.sendKeys("451714");
        addNewCustomerElements.phoneNumber.sendKeys("9860860565");
        addNewCustomerElements.email.sendKeys("vv@gmail.com");
        addNewCustomerElements.submit.click();
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "successfully added";
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
}
