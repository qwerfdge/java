package ua.brekher.hw3Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GmailLoginTests {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testInputPresence() {
        driver.get("https://accounts.google.com");
        WebElement emailInput = driver.findElement(By.name("identifier"));
        assertTrue(emailInput.isDisplayed());
    }

    @Test
    public void testInputPlaceholder() {
        driver.get("https://accounts.google.com");
        WebElement emailInput = driver.findElement(By.name("identifier"));
        String placeholderText = emailInput.getAttribute("placeholder");
        assertEquals("Електронна адреса або номер телефону", placeholderText);
    }
    est
    public void testInvalidEmailValidation() {
        driver.get("https://accounts.google.com");
        WebElement emailInput = driver.findElement(By.name("identifier"));
        emailInput.sendKeys("invalidemail");
        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();
        try {
            Thread.sleep(2000);  // Зачекайте на валідаційне повідомлення
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement validationMessage = driver.findElement(By.xpath("//div[@role='alert']"));
        assertEquals("Введіть дійсні електронну адресу або номер телефону", validationMessage.getText());
    }
}

