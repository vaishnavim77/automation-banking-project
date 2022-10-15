package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.junit.Assert;
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

    @When("enter invalidId")
    public void enter_invalid_id() {
        loginActions.enterInvalidUserId();
    }

    @Then("log in should fail")
    public void log_in_should_fail() {

    }

    @And("enter valid userId {string}")
    public void enter_valid_user_id(String userId) {
        loginActions.enterUserId(userId);
    }
    @When("enter invalidPassword")
    public void enter_invalid_password() throws InterruptedException {
        loginActions.enterInvalidPassword();
    }

    @When("I enter {string} in username field")
    public void i_enter_in_username_field(String string) {
        loginActions.enterInvalidUserId2(string);
    }
    @When("I enter {string},{string} in password field")
    public void i_enter_in_password_field(String userId, String password) {
        loginActions.enterInvalidPasswordId2(userId,password);
    }


    @Then("I should get {string}")
    public void i_should_get(String string) throws InterruptedException {
       loginActions.i_should_get(string);

    }



}
