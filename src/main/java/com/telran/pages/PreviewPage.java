package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreviewPage extends BasePage{
    public PreviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "place-order")
    WebElement PlaceOrder;

    public OrderConformationPage clickOnPlaceOrderButton() {
        clickWithJSExecutor(PlaceOrder,700,0);
        return new OrderConformationPage(driver);
    }
}
