package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="id_registration-email")
    WebElement emailField;

    @FindBy(id="id_registration-password1")
    WebElement passwordField;

    @FindBy(id="id_registration-password2")
    WebElement confirmPasswordField;

    @FindBy(name="registration_submit")
    WebElement registerButton;

    public RegisterPage fillRegisterForm(String email, String password, String password1) {
        type(emailField, email);
        type(passwordField,password);
        type(confirmPasswordField,password1);
        registerButton.click();
        return this;

    }

}

