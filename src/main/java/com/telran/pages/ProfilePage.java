package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    public ProfilePage (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//h1[.='Профиль']")
    WebElement confirmationLogin;

    public String verifyLoginText() {
        return confirmationLogin.getText();

    }
}
