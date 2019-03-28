package com.imooc.jdk11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

/**
 * <h1>标准 HTTP 客户端</h1>
 */
public class HttpClientExample {

    /**
     * <h2>同步的 Get 方法</h2>
     *
     * @param uri
     * @throws Exception
     */
    private static void syncGet(String uri) throws Exception {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(
                URI.create(uri)
        ).build();
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    /**
     * <h2>异步 Get 方法</h2>
     */
    private static void asyncGet(String uri) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(
                URI.create(uri)
        ).build();
        CompletableFuture<HttpResponse<String>> future =
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        future.whenComplete((resp, ex) -> {
            if (ex != null) {
                ex.printStackTrace();
            } else {
                System.out.println(resp.statusCode());
                System.out.println(resp.body());
            }
        }).join();
    }

    public static void main(String[] args) throws Exception {

        String uri = "http://t.weather.sojson.com/api/weather/city/101030100";
//        syncGet(uri);
        asyncGet(uri);
    }
}
