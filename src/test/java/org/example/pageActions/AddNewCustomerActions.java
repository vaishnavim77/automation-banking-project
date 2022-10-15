package org.example.pageActions;

import org.example.pageElements.AddNewCustomerElements;
import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
        addNewCustomerElements.email.sendKeys("ami123@gmail.com");
        addNewCustomerElements.password.sendKeys("123456");
        addNewCustomerElements.submit.click();
        /*String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "successfully added";
        Assert.assertEquals(ExpectedTitle, ActualTitle);*/
        /*Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);*/
    }

    public void canNotEnterNumberAtName() throws InterruptedException {
        addNewCustomerElements.customerName.sendKeys("123");
        String Actual = addNewCustomerElements.numberAreNotAllowedMessage.getText();
        String Expected = "Numbers are not allowed";
        Assert.assertEquals(Expected,Actual);
    }
    public void special_characters_are_not_allowed(){
        addNewCustomerElements.customerName.sendKeys("*");
        String Actual = addNewCustomerElements.numberAreNotAllowedMessage.getText();
        String Expected = "Special characters are not allowed";
        Assert.assertEquals(Expected,Actual);
    }
    public void customer_name_must_not_be_blank() throws InterruptedException {
        addNewCustomerElements.customerName.sendKeys(" ");
        String Actual = addNewCustomerElements.numberAreNotAllowedMessage.getText();
        String Expected = "Customer name must not be blank";
        Assert.assertEquals(Expected,Actual);
        Thread.sleep(2000);
    }

    public void first_character_cannot_have_space(){
        addNewCustomerElements.customerName.sendKeys(" abc");
        String Actual = addNewCustomerElements.numberAreNotAllowedMessage.getText();
        String Expected = "First character cannot have space";
        Assert.assertEquals(Expected,Actual);

    }
    public void address_field_must_not_be_blank() throws InterruptedException {
        addNewCustomerElements.customerName.sendKeys("Prisha");
        addNewCustomerElements.gender.click();
        addNewCustomerElements.dateOfBirth.sendKeys("10-09-2000");

        addNewCustomerElements.address.click();
        Thread.sleep(2000);
        addNewCustomerElements.city.click();
        Thread.sleep(2000);
        String Actual = addNewCustomerElements.addressValidationMessage.getText();
        String Expected = "Address Field must not be blank";
        Assert.assertEquals(Expected,Actual);
    }

    public void first_character_can_not_have_space() throws InterruptedException {
        addNewCustomerElements.customerName.sendKeys("Prisha");
        addNewCustomerElements.gender.click();
        addNewCustomerElements.dateOfBirth.sendKeys("10-09-2000");
        addNewCustomerElements.address.sendKeys(" assdj");
        Thread.sleep(2000);
        String Actual = addNewCustomerElements.addressValidationMessage.getText();
        String Expected = "First character can not have space";
        Assert.assertEquals(Expected,Actual);
    }

    public void special_characters_are_not_allowed_at_address_field() throws InterruptedException {
        addNewCustomerElements.customerName.sendKeys("Prisha");
        addNewCustomerElements.gender.click();
        addNewCustomerElements.dateOfBirth.sendKeys("10-09-2000");
        addNewCustomerElements.address.sendKeys("assdj*");
        Thread.sleep(2000);
        String Actual = addNewCustomerElements.addressValidationMessage.getText();
        String Expected = "Special characters are not allowed";
        Assert.assertEquals(Expected,Actual);

    }
}
