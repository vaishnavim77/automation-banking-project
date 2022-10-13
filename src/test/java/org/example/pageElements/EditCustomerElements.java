package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerElements {
    WebDriver driver;

    @FindBy(xpath = "//a[@href=\"EditCustomer.php\"]")
    public WebElement editCustomer;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement customerId;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement submit;

    public EditCustomerElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
