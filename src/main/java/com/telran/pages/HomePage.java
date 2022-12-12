package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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
    @FindBy(xpath = "//*[.='All products']")
    WebElement allProductsLink;

    public AllProductsPage clickAllProductslink() {
        click (allProductsLink);
        return new AllProductsPage(driver);

    }

    public void click(WebElement allProductsLink) {
        allProductsLink.click();
    }

    @FindBy(xpath = "//div[@class = 'row']/div[2]//span/a")
    WebElement ViewBasket;

    public BasketPage clickViewBasketLink() {
        click(ViewBasket);
        return new BasketPage(driver);
    }

}
