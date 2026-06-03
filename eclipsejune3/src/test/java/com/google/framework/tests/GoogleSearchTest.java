package com.google.framework.tests;

import com.google.framework.base.BaseTest;
import com.google.framework.pages.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        GoogleHomePage home = new GoogleHomePage(driver);
        home.search("Selenium WebDriver");
        Assert.assertTrue(driver.getTitle().contains("Selenium WebDriver"));
    }
}

