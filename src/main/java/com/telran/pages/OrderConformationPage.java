package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;


public class OrderConformationPage extends BasePage {
    public OrderConformationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[.='Oscar']")
    WebElement OscarLogo;

    public OrderConformationPage clickOnOscarLogo() {
        click(OscarLogo);
        return this;
    }
    @FindBy(xpath = "//*[.='Welcome!']")
    WebElement WelcomeText;

    public String verifyWelcomeText() {
        return WelcomeText.getText();
    }
}
