package com.google.framework.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
