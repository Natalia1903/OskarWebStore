package com.telran.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void click(WebElement element) {
        element.click();
    }
    public void clickWithJSExecutor(WebElement element, int x, int x1) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + x1 + ")");
        element.click();
    }
    public void type(WebElement element, String text) {
        if (text!= null){
            element.click();
            element.clear();
            element.sendKeys(text);
        }


    }

}