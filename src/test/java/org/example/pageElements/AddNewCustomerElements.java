package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerElements {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='New Customer']")
    public WebElement newCustomer;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement customerName;

    @FindBy(xpath="//tr[5]//input[1]")
    public WebElement gender;

    @FindBy(xpath="//*[@id=\"dob\"]")
    public WebElement dateOfBirth;

    @FindBy(xpath="//tr[7]/td[2]/textarea")
    public WebElement address;

    @FindBy(xpath="//tr[8]/td[2]/input")
    public WebElement city;

    @FindBy(xpath="//input[@name='state']")
    public WebElement state;

    @FindBy(xpath="//input[@name='pinno']")
    public WebElement pincode;

    @FindBy(xpath="//input[@name='telephoneno']")
    public WebElement phoneNumber;

    @FindBy(xpath="//input[@name='emailid']")
    public WebElement email;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath="//input[@name='sub']")
    public WebElement submit;

    public AddNewCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
