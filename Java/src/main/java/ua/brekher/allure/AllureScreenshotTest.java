package ua.brekher.allure;

import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

public class AllureScreenshotTest {

    @Test
    public void testWithScreenshot() {

        int actualResult = 10 + 20;
        int expectedResult = 30;


        try {
            Assert.assertEquals(actualResult, expectedResult, "Результат обчислення невірний");
        } catch (AssertionError e) {

            byte[] screenshot = getScreenshot();
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
            throw e;
        }
    }


    private byte[] getScreenshot() {

        return new byte[]{};
    }
}
