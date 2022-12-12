package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href='/en-gb/checkout/']")
    WebElement ProceedToCheckoutButton;

    public ShippingAddressPage clickOnProceedToCheckoutButton() {
        ProceedToCheckoutButton.click();
        return new ShippingAddressPage(driver);
    }
}
