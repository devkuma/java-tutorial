package com.devkuma.tutorial.solid.dip.bad;

import com.devkuma.tutorial.solid.dip.HttpClient;

public class DataProvider {
    public HttpClient httpClient;

    public DataProvider(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String getData() {
        return httpClient.get("URL");
    }
}
