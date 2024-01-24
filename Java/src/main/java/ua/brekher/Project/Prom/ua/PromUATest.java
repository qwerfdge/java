package ua.brekher.Project.Prom.ua;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PromUATest {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        String baseUrl;
        baseUrl = "https://prom.ua/";
        driver.get(baseUrl + "/login");
    }

    @Test(priority = 1, description = "Verify Login Functionality")
    public void testLogin() {
        loginPage.login("your_username", "your_password");
    }

    @Test(priority = 2, description = "Verify Search Functionality")
    public void testSearchProduct() {
        homePage.searchProduct("Product Name");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

