package ua.brekher.ProjectTest;

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