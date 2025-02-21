package com.biglots.com.leetcode.model;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
public class BasicAuth {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com/maps");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        String userCredentials = "username:password";
        String basicAuth = "Basic " + Base64.getEncoder().encodeToString(userCredentials.getBytes());

        connection.setRequestProperty("Authorization", basicAuth);

        System.out.println("Response Code: " + connection.getResponseCode());
    }
}
