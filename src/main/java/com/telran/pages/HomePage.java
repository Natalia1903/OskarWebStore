package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(id="login_link")
    WebElement loginLink;

    public RegisterPage clickOnLoginOrRegisterLink() {
        loginLink.click();
        return new RegisterPage(driver);

    }
    @FindBy(xpath = "//i[@class='icon-user']")
    WebElement accountLink;

    public ProfilePage clickOnAccountlink() {
        accountLink.click();
        return new ProfilePage(driver);
    }
}
