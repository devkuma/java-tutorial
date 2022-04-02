package com.devkuma.tutorial.solid.dip.good;

import com.devkuma.tutorial.solid.dip.HttpClient;

public class DataProvider {

    public HttpClient httpClient;

    public DataProvider(CustomHttpClient customHttpClient) {
        this.httpClient = customHttpClient;
    }

    public String getData() {
        return httpClient.get("URL");
    }
}