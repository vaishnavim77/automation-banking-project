package org.example.pageActions;

import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginActions {
   private WebDriver driver;
    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }

    public void enterInvalidUserId(){
        loginElements.userId.click();
        Actions action = new Actions(driver);
        action.moveToElement(loginElements.password).click().perform();
        String Actual = loginElements.invalidLoginIdMessage.getText();
        String Expected = "User-ID must not be blank";
        Assert.assertEquals(Expected, Actual);
    }

    public void enterInvalidPassword() throws InterruptedException {
        loginElements.password.click();
        Actions action = new Actions(driver);
        action.moveToElement(loginElements.logIn).click().perform();
        Thread.sleep(2000);
        String Actual = loginElements.invalidPasswordMessage.getText();
        System.out.println(Actual);
        String Expected = "Password must not be blank";
        Assert.assertEquals(Expected,Actual);
    }
    public void enterUserId(String userId){loginElements.userId.sendKeys(userId);}
    public void enterPassword(String password){loginElements.password.sendKeys(password);}
    public void clickOnLoginButton() {
        loginElements.logIn.click();
    }
}
