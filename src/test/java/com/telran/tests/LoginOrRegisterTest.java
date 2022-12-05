package com.telran.tests;

import com.telran.pages.HomePage;
import com.telran.pages.LoginPage;
import com.telran.pages.RegisterPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginOrRegisterTest extends BaseTest{

    @BeforeMethod
    public void EnsurePreconditions(){
        new HomePage(driver).clickOnLoginOrRegisterLink();

    }
    @Test
    public void NewUserRegistrationPositiveTest(){
        new RegisterPage(driver).fillRegisterForm("Sascha@gmail.com",
                "Sascha12345!","Sascha12345!");
       // Assert.assertTrue(new RegisterPage(driver).)

    }

    @Test
    public void  LoginPositiveTest (){
        new LoginPage(driver).fillLoginForm("Sascha@gmail.com","Sascha12345!");
        new HomePage(driver).clickOnAccountlink();

    }



}
