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
        home.search("Selenium WebDriver");
        
        //Test
        
        
     // 1. Create a wait object that will wait up to 10 seconds
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // 2. Wait UNTIL the title contains the text we expect
        //boolean isTitleCorrect = wait.until(ExpectedConditions.titleContains("Selenium WebDriver"));
        
        // 3. Now assert it
        //Assert.assertTrue(isTitleCorrect, "The title did not change to include the search query.");    }
}
}

