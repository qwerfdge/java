package ua.brekher.Project.Prom.ua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) { }

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://prom.ua/signin");
    }

    @Test(description = "Verify successful login with valid credentials")
    public void testSuccessfulLogin() {

        WebElement loginInput = driver.findElement(By.id("login-email"));
        WebElement passwordInput = driver.findElement(By.id("login-password"));
        WebElement loginButton = driver.findElement(By.cssSelector(".x-button-content"));

        loginInput.sendKeys("your_username");
        passwordInput.sendKeys("your_password");
        loginButton.click();


    }

    @Test(description = "Verify error message with invalid credentials")
    public void testInvalidLogin() {

        WebElement loginInput = driver.findElement(By.id("login-email"));
        WebElement passwordInput = driver.findElement(By.id("login-password"));
        WebElement loginButton = driver.findElement(By.cssSelector(".x-button-content"));

        loginInput.sendKeys("invalid_username");
        passwordInput.sendKeys("invalid_password");
        loginButton.click();


    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}


