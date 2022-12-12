package com.telran.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage extends BasePage{
    public ShippingAddressPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "id_first_name")
    WebElement firstNameField;

    @FindBy(id = "id_last_name")
    WebElement lastNameField;

    @FindBy(id = "id_line1")
    WebElement firstLineOfAddressField;

    @FindBy(id = "id_line4")
    WebElement cityField;

    @FindBy(id = "id_postcode")
    WebElement postCodeField;

    public ShippingAddressPage fillNewAddressForm(String firstName, String lastName,
                                                  String firstLineOfAddress, String city, String postCode) {
        type(firstNameField, firstName);
        type(lastNameField, lastName);
        type(firstLineOfAddressField, firstLineOfAddress);
        type(cityField, city);
        type(postCodeField, postCode);
        return this;
    }
      @FindBy(id = "id_country")
      WebElement countryName;

    public ShippingAddressPage selectCountry(String text) {
        clickWithJSExecutor(countryName, 600, 0);
        Select select = new Select(countryName);
        select.selectByVisibleText(text);
        return this;
    }

    @FindBy(xpath = "//*[.='Continue']")
    WebElement ContinueButton;

    public ShippingAddressPage clickOnContinueButton() {
        clickWithJSExecutor(ContinueButton,700,0);
        return this;
    }
}
