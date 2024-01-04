package ua.brekher.hw1Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailLoginTests2 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
    }

    @Test
    public void testEmailPhoneInputPlaceholder() {
        WebElement inputElement = driver.findElement(By.cssSelector("input[type='email']"));
        String placeholderText = inputElement.getAttribute("placeholder");
        Assert.assertEquals(placeholderText, "Електронна адреса або номер телефону");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

