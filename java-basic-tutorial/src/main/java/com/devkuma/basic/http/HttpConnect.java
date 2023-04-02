package com.devkuma.basic.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpConnect {
    public static void main(String[] args) throws InterruptedException {
        // 1. HttpClient을 생성
        HttpClient cli = HttpClient.newBuilder()
                                   .version(HttpClient.Version.HTTP_2)
                                   .build();
        // 2. HttpRequest을 생성
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("https://www.devkuma.com/"))
                                         .build();
        // 3. Requset을 송신
        cli.sendAsync(request, HttpResponse.BodyHandlers.ofString())
           // 4. Response을 수신
           .thenAccept(response -> {
               System.out.println(response.body());
           });

        Thread.sleep(3000);
    }
}
