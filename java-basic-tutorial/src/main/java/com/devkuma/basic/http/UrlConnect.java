package com.devkuma.basic.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnect {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://devkuma.com/");
            URLConnection con = url.openConnection();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"))) {
                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
