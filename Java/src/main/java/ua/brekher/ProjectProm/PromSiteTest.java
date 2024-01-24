package main.java.ua.brekher.ProjectProm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class PromSiteTest {


    public class PromSiteTest {

        private WebDriver driver;

        @Before
        public void setUp() {
            driver = new ChromeDriver();
        }

        @Test
        public void testLoginAndWelcomeMessage() {
            driver.get("https://prom.ua");

            WebElement loginButton = driver.findElement(By.id("loginButton")); // Замените на реальный идентификатор кнопки входа
            loginButton.click();

            WebElement loginInput = driver.findElement(By.id("loginInput")); // Замените на реальный идентификатор поля ввода логина
            WebElement passwordInput = driver.findElement(By.id("passwordInput")); // Замените на реальный идентификатор поля ввода пароля
            WebElement submitButton = driver.findElement(By.id("submitButton")); // Замените на реальный идентификатор кнопки отправки

            loginInput.sendKeys("ваш_логин");
            passwordInput.sendKeys("ваш_пароль");
            submitButton.click();

            WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage")); // Замените на реальный идентификатор приветственного сообщения
            Assert.assertTrue(welcomeMessage.getText().contains("Добро пожаловать"));
        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

}
