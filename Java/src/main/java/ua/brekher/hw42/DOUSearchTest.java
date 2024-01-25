package main.java.ua.brekher.hw42;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DOUSearchTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Ініціалізація браузера
        System.setProperty("webdriver.chrome.driver", "/повний/шлях/до/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) driver.quit();
    }

    @Test(dataProvider = "searchQueries")
    public void searchOnDOU(String searchQuery) {

        driver.get("https://dou.ua/");

    }

    @DataProvider(name = "searchQueries")
    public Object[][] searchQueries() {

        return new Object[][]{
                {"Java"},
                {"QA"},
        };
    }
}
