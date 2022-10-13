package org.example.pageActions;

import org.example.pageElements.AddNewCustomerElements;
import org.example.pageElements.CreateNewAccountElements;
import org.example.pageElements.EditAccountElements;
import org.example.pageElements.EditCustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditAccountActions {
    WebDriver driver;
    EditAccountElements editAccountElements;
   CreateNewAccountElements createNewAccountElements;
    public EditAccountActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
        createNewAccountElements = new CreateNewAccountElements(driver);
        editAccountElements = new EditAccountElements(driver);
    }
    public void clickOnEditAccount() throws InterruptedException {
        editAccountElements.editAccount.click();
        System.out.println("working");
    }
    public void enterAccountId() throws InterruptedException {editAccountElements.accountNo.sendKeys("112762");
        editAccountElements.submit.click();
        Thread.sleep(2000);
        createNewAccountElements.submit.click();}
}
