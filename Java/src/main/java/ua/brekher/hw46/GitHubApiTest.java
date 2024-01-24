package main.java.ua.brekher.hw46;

import org.junit.Test;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpRequest;

import java.net.URI;

public class GitHubApiTest {

    @Test
    public <JSONObject>
    void testGitHubApiWithHttpClient() throws Exception {

        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request;
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/emojis"))
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        JSONObject jsonResponse = new JSONObject(response.body());


        assertTrue(jsonResponse.has("articulated_lorry"));
    }
