package com.google.framework.tests;

import com.google.framework.base.BaseTest;
import com.google.framework.pages.GoogleHomePage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        GoogleHomePage home = new GoogleHomePage(driver);
        
        // Search for "keyboard facebook"
        home.search("keyboard facebook");
        
        // Click the first suggested Facebook link
        home.clickFirstFacebookLink();
        
        // Optionally wait a moment to see the page load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

