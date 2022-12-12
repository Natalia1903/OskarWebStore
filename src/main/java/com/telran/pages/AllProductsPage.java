package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductsPage extends BasePage{
    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ol[@class = 'row']/li[2]//button")
    WebElement Secondbook;
    public AllProductsPage addToBasket() {
        Secondbook.click();
        return this;
    }
}
