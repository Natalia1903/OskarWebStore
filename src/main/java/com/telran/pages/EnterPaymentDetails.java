package com.telran.pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterPaymentDetails extends BasePage{
    public EnterPaymentDetails(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[.='Continue']")
    WebElement Continue;

    public PreviewPage clickOnContinueButton() {
        click(Continue);
        return new PreviewPage(driver);

    }
}
