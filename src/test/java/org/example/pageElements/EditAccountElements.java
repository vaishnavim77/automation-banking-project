package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountElements {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='editAccount.php']")
    public WebElement editAccount;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement accountNo;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement submit;

    public EditAccountElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
