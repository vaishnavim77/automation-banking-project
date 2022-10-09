package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LogInSteps {
    WebDriver driver;
    LoginActions loginActions;

    public LogInSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions = loginActions;
    }
    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {

    }
    @When("Enter I enter {string}, {string} and click on login")
    public void enter_i_enter_and_click_on_login(String userId, String password) {
        loginActions.enterUserId(userId);
        loginActions.enterPassword(password);
        loginActions.clickOnLoginButton();
    }
    @Then("Login should be successful")
    public void login_should_be_successful() {

    }

}
