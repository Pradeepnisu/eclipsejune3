package com.google.framework.base;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	
	protected WebDriver driver;
	
	@BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        // 1. Create ChromeOptions
        ChromeOptions options = new ChromeOptions();
        
        // 2. Add this specific argument to fix the SocketException
        options.addArguments("--remote-allow-origins=*"); 

        // 3. Pass the options to the ChromeDriver
        driver = new ChromeDriver(options); 
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
