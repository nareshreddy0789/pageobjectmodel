package com.bayamp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by naresh on 2/24/2016.
 */
public class LoginPage {

    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver) {
        element = driver.findElement(By.id("login-username"));
        return element;
    }

    public static WebElement txtbx_Password(WebDriver driver) {
        element = driver.findElement(By.id("login-passwd"));
        return element;
    }

    public static WebElement btn_LogIn(WebDriver driver) {
        element = driver.findElement(By.id("login-signin"));
        return element;
    }
}




