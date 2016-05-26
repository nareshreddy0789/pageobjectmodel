package com.bayamp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by naresh on 2/24/2016.
 */
public class HomePage {

    private static WebElement element = null;

    public static WebElement lnk_MyAccount(WebDriver driver) {

        element = driver.findElement(By.linkText("Sign in"));

        return element;

    }

    public static WebElement lnk_LogOut(WebDriver driver) {

        element = driver.findElement(By.xpath("//li[@id='uh-profile']/button"));
        //Initiate mouse action using Actions class
        Actions builder = new Actions(driver);
        // move the mouse to the earlier identified menu option
        builder.moveToElement(element).build().perform();
        // wait for max of 5 seconds before proceeding. This allows sub menu appears properly before trying to click on it
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign Out")));  // until this submenu is found
        //identify menu option from the resulting menu display and click
        WebElement menuOption = driver.findElement(By.linkText("Sign Out"));
        return menuOption;
    }
}



