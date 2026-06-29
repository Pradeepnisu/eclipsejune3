package com.google.framework.pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {
    WebDriver driver;

    @FindBy(name="q")
    WebElement searchBox;

    @FindBy(name="btnK")
    WebElement searchButton;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String keyword) {
        searchBox.sendKeys(keyword);
        searchBox.submit(); // alternative to clicking btnK
    }

    public void clickFirstFacebookLink() {
        // Wait for search results to load (wait for the results div)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
            org.openqa.selenium.By.xpath("//a[contains(@href, 'facebook.com')]")
        ));

        // Find all links that contain 'facebook.com' in href
        List<WebElement> facebookLinks = driver.findElements(
            org.openqa.selenium.By.xpath("//a[contains(@href, 'facebook.com')]")
        );

        // Click the first Facebook link
        if (!facebookLinks.isEmpty()) {
            facebookLinks.get(0).click();
        } else {
            throw new RuntimeException("No Facebook link found in search results");
        }
    }
}
