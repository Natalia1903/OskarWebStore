package com.telran.tests;

import com.telran.pages.*;
import com.telran.pages.data.TextData;
import com.telran.pages.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{

    @BeforeMethod
    public void EnsurePreconditions() {
        new HomePage(driver).clickOnLoginOrRegisterLink();
        new LoginPage(driver).fillLoginForm(UserData.USER_EMAIL,UserData.USER_PASSWORD);
        new HomePage(driver).clickAllProductslink();

    }
    @Test
    public void AddToBasketTest(){
        new AllProductsPage(driver).addToBasket();
        new HomePage(driver).clickViewBasketLink();
        new BasketPage(driver).clickOnProceedToCheckoutButton();
        new ShippingAddressPage(driver).fillNewAddressForm(UserData.FIRST_NAME,UserData.LAST_NAME,
                UserData.FIRST_LINE_OF_ADDRESS,UserData.CITY,UserData.POST_CODE);
        new ShippingAddressPage(driver).selectCountry("Germany").clickOnContinueButton();
        new  EnterPaymentDetails(driver).clickOnContinueButton();
        new PreviewPage(driver).clickOnPlaceOrderButton().clickOnOscarLogo();
        Assert.assertTrue(new OrderConformationPage(driver).verifyWelcomeText().contains(TextData.TITLE_OF_AN_ITEM));

    }

}
