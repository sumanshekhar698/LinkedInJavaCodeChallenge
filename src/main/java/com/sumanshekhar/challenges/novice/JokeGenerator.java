package com.sumanshekhar.challenges.novice;

import com.google.gson.Gson;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

/*There are variety of ways you can call an API in Java but we'll
be using the built-in HTTP client introduced in Java 11.
In order to call an API,
we'll need to create an HTTP client that will communicate with the external service for us.
*/
public class JokeGenerator {

    public static Optional<Joke> parseJoke(String responseBody) {
        System.out.println("RESPONSE --> " + responseBody);

        try {
            Joke[] jokes = new Gson().fromJson(responseBody,
                    Joke[].class);

            if (jokes.length > 0) {
                return Optional.of(jokes[0]);
            } else {
                return Optional.empty();
            }

        } catch (Exception e) {

            System.out.println("Must be out of jokes for now.");
            return Optional.empty();
        }
    }

    @SneakyThrows
    public static void tellJoke(Joke joke) {

        System.out.println(joke.getSetup());
        Thread.sleep(4000);
        System.out.println(joke.getPunchline());
    }

    public static void main(String[] args) throws IOException,
            InterruptedException {

        // Create a client
        var client = HttpClient.newHttpClient();

        // Create a request
        var request = HttpRequest.newBuilder(
                        URI.create("https://official-joke-api.appspot.com/jokes/programming/random"))
                .header("accept", "application/json")
                .build();

        // Use the client to send the request
        var response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        // Use helper method to parse the Joke
        Optional<Joke> jokeOpt = parseJoke(response.body());

        // Tell the joke if there is a joke to tell
        jokeOpt.ifPresent(JokeGenerator::tellJoke);
    }
}
