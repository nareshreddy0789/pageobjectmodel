/*
package com.bayamp.tests;

import com.bayamp.pageobjects.HomePage;
import com.bayamp.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

*/
/**
 * Created by naresh on 2/24/2016.
 *//*

public class LoginTest {
    private static WebDriver driver = null;

    @Test
    public void logintest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.yahoo.com/");
        // Use page Object library now
        HomePage.lnk_MyAccount(driver).click();
        LoginPage.txtbx_UserName(driver).sendKeys("lakshminaresh.komma");
        LoginPage.txtbx_Password(driver).sendKeys("Komma_1439");
        LoginPage.btn_LogIn(driver).click();
        boolean check = HomePage.lnk_LogOut(driver).isDisplayed();
        Assert.assertTrue(check);
        driver.quit();
    }
}
*/
