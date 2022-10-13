package org.example.pageActions;

import org.example.pageElements.CreateNewAccountElements;
import org.example.pageElements.DeleteCustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountActions {
    WebDriver driver;
    CreateNewAccountElements createNewAccountElements;

    public CreateNewAccountActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
        createNewAccountElements = new CreateNewAccountElements(driver);
    }

    public void clickOnCreateNewAccount() throws InterruptedException {
        createNewAccountElements.addAccount.click();
        Thread.sleep(2000);
    }
    public void fillAccountDetail(){
        createNewAccountElements.custId.sendKeys("15198");
        Select select = new Select(createNewAccountElements.selectAccountType);
        select.selectByValue("Savings");
        createNewAccountElements.initialDeposit.sendKeys("10000");
        createNewAccountElements.submit.click();
    }
}
