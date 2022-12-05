package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="id_login-username")
    WebElement emailField;

    @FindBy(id="id_login-password")
    WebElement passwordField;

    @FindBy(xpath = "//*[@name='login_submit']")
    WebElement loginButton;

    public HomePage fillLoginForm(String email, String password) {
        type(emailField, email);
        type(passwordField, password);
        loginButton.click();
        return new HomePage(driver);
    }
}
