package main.java.ua.brekher.hw9Automation;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {

    @Test
    public void testEmojisWithRestAssured() {
        given()
                .when()
                .get("https://api.github.com/emojis")
                .then()
                .assertThat()
                .body(containsString("articulated_lorry"));
    }
}

