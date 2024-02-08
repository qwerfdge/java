package main.java.ua.brekher.hw5Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/anastasia/webDriver/chromedriver_linux64");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.example.com");


        Actions actions = new Actions(driver);


        WebElement elementToHoverOver = driver.findElement(By.id("elementId"));
        actions.moveToElement(elementToHoverOver).perform();


        WebElement elementToClick = driver.findElement(By.xpath("//button[@id='buttonId']"));
        actions.click(elementToClick).perform();


        WebElement elementToDrag = driver.findElement(By.id("dragElementId"));
        WebElement dropLocation = driver.findElement(By.id("dropLocationId"));
        actions.dragAndDrop(elementToDrag, dropLocation).perform();


        driver.quit();
    }
}

