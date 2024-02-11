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

    // Метод для зняття скріншоту (приклад)
    private byte[] getScreenshot() {
        // Код для зняття скріншоту (приклад)
        // В даному випадку, так як ми не маємо веб-драйвера, можемо скористатися, наприклад, Robot API або іншими способами
        return new byte[]{};
    }
}
