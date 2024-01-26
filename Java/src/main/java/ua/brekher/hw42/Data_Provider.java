package main.java.ua.brekher.hw42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

    WebDriver driver;

    @Test(dataProvider="searchText")
    public void paramByDataProvider(String monument,String city) throws InterruptedException {
        //Initializing Driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        //Opening search engine
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys(monument +" "+city);
        System.out.println("You are trying to search " +monument+ " which is in " +city);

        WebElement srchBtn = driver.findElement(By.name("btnK"));
        srchBtn.submit();
        Thread.sleep(3000);
        System.out.println("The page title is: " +driver.getTitle());
        driver.quit();
    }


    /*Data Provider which returns Object[][] wherein
     *  first column has 'monument' and the second one has 'city'
     **/

    @DataProvider(name="searchText")
    public Object[][] getDataProviderData(){
        Object[][] searchWords=new Object[3][2];
        //Enter data into Object Array
        searchWords[0][0]="India Gate";
        searchWords[0][1]="Delhi";
        searchWords[1][0]="Taj Mahal";
        searchWords[1][1]="Agra";
        searchWords[2][0]="Char Minar";
        searchWords[2][1]="Hyderabad";
        return searchWords;

    }
}
