package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void type(WebElement element, String text) {
        if (text!= null){
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

}
