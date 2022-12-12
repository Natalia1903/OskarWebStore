package com.telran.tests;

import com.telran.pages.HomePage;
import com.telran.pages.LoginPage;
import com.telran.pages.ProfilePage;
import com.telran.pages.RegisterPage;
import com.telran.pages.data.AssertData;
import com.telran.pages.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginOrRegisterTest extends BaseTest{

    @BeforeMethod
    public void EnsurePreconditions(){
        new HomePage(driver).clickOnLoginOrRegisterLink();

    }
    @Test
    public void NewUserRegistrationPositiveTest(){
        new RegisterPage(driver).fillRegisterForm(UserData.USER_EMAIL,
                UserData.USER_PASSWORD,UserData.USER_CONFIRM_PASSWORD);
       Assert.assertTrue(new RegisterPage(driver).verifyRegisterText().contains(AssertData.CONFIRMATION_REGISTRATION));

    }

    @Test
    public void  LoginPositiveTest () {
        new LoginPage(driver).fillLoginForm(UserData.USER_EMAIL, UserData.USER_PASSWORD);
        new HomePage(driver).clickOnAccountlink();
        Assert.assertTrue(new ProfilePage(driver).verifyLoginText().contains(AssertData.CONFIRMATION_LOGIN));

    }
}
