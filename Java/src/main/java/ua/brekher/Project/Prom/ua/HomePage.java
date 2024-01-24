package ua.brekher.Project.Prom.ua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(By.id("searchBox")).sendKeys(productName);
        driver.findElement(By.id("searchButton")).click();
    }
}

