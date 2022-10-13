package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountElements {

    WebDriver driver;
    @FindBy(xpath = "//a[@href='addAccount.php']")
    public WebElement addAccount;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement custId;

    @FindBy(xpath = "//select[@name='selaccount']")
    public WebElement selectAccountType;

    @FindBy(xpath = "//input[@name='inideposit']")
    public WebElement initialDeposit;

    @FindBy(xpath = "//input[@name='button2']")
    public WebElement submit;

    public CreateNewAccountElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
