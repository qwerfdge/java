package ua.brekher.Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test(description = "Verify that a user can successfully log in with valid credentials")
    public void testLoginWithValidCredentials() {
    }

    @Test(description = "Verify error message for invalid login")
    public void testInvalidLoginErrorMessage() {
    }
}
