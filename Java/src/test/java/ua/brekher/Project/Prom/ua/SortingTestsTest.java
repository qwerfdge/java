package ua.brekher.Project.Prom.ua;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortingTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Ініціалізація браузера
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        // Відкриття сторінки для сортування
        driver.get("https://prom.ua/");
    }

    @Test(description = "Verify products are sorted by price in ascending order")
    public void testSortByPriceAscending() {
        // Додайте тести для перевірки сортування за ціною
    }

    @Test(description = "Verify products are sorted by name in descending order")
    public void testSortByNameDescending() {
        // Додайте тести для перевірки сортування за ім'ям
    }

    @AfterMethod
    public void tearDown() {
        // Закриття браузера
        if (driver != null) {
            driver.quit();
        }
    }
}
