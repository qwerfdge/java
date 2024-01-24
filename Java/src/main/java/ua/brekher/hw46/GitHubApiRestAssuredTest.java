package main.java.ua.brekher.hw46;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GitHubApiRestAssuredTest {

    @Test
    void testGitHubApiWithRestAssured() {
        // Встановлення базового URL для API
        RestAssured.baseURI = "https://api.github.com";

        // Використання RestAssured для виконання GET-запиту та перевірки вмісту відповіді
        given()
                .when()
                .get("/emojis")
                .then()
                .statusCode(200)
                .body("articulated_lorry", notNullValue());
    }
}
