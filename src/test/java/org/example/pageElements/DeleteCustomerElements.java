package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerElements {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='DeleteCustomerInput.php']")
    public WebElement deleteCustomer;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement customerId;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement submit;

    public DeleteCustomerElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
