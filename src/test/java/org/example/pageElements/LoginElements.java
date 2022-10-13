package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {

    WebDriver driver;
    @FindBy(name = "uid")
    public WebElement userId;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "btnLogin")
    public WebElement logIn;

    @FindBy(xpath = "//label[@id='message23']")
    public WebElement invalidLoginIdMessage;

    @FindBy(xpath = "//label[@id='message18']")
    public WebElement invalidPasswordMessage;

    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
