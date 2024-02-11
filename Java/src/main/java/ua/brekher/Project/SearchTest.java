package ua.brekher.Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest {
    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test(description = "Verify search functionality with different search terms", dataProvider = "searchTerms")
    public void testSearchFunctionality(String searchTerm) {
    }

    @DataProvider(name = "searchTerms")
    public Object[][] searchData() {
        return new Object[][] {
                {"Laptop"},
                {"Smartphone"},
                {"Headphones"}
        };
    }
}
