package br.com.alura.literalura.service;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiFetchService {

    public static String fetchData(String url) {
        try {
            URI address = URI.create(url);

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(address)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        } catch (IOException | InterruptedException | UncheckedIOException error) {
            throw new RuntimeException("Error fetching data from given URL. " + error.getMessage());
        }
    }

}
