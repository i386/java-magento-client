package com.github.chen0040.magento.http;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MagentoOkHttpClient implements HttpClient {
    private final OkHttpClient http;

    public MagentoOkHttpClient() {
        this.http = new OkHttpClient();
    }

    public MagentoOkHttpClient(OkHttpClient http) {
        this.http = http;
    }

    @Override
    public String post(String url, String body, Map<String, String> headers) throws IOException {
        Request.Builder req = new Request.Builder()
                .url(url)
                .post(RequestBody.create(body, MediaType.get("application/json")));
        for (Map.Entry<String, String> header : headers.entrySet()) {
            req.addHeader(header.getKey(), header.getValue());
        }
        try (Response response = http.newCall(req.build()).execute()) {
            ResponseBody responseBody = response.body();
            return responseBody == null ? "" : responseBody.string();
        }
    }

    @Override
    public String put(String url, String body, Map<String, String> headers) throws IOException {
        Request.Builder req = new Request.Builder()
                .url(url)
                .put(RequestBody.create(body, MediaType.get("application/json")));
        for (Map.Entry<String, String> header : headers.entrySet()) {
            req.addHeader(header.getKey(), header.getValue());
        }
        try (Response response = http.newCall(req.build()).execute()) {
            ResponseBody responseBody = response.body();
            return responseBody == null ? "" : responseBody.string();
        }
    }

    @Override
    public String delete(String url, Map<String, String> headers) throws IOException {
        Request.Builder req = new Request.Builder()
                .url(url)
                .delete();
        for (Map.Entry<String, String> header : headers.entrySet()) {
            req.addHeader(header.getKey(), header.getValue());
        }
        try (Response response = http.newCall(req.build()).execute()) {
            ResponseBody responseBody = response.body();
            return responseBody == null ? "" : responseBody.string();
        }
    }

    @Override
    public String get(String uri, Map<String, String> headers) throws IOException {
        Request.Builder req = new Request.Builder()
                .url(uri)
                .get();
        for (Map.Entry<String, String> header : headers.entrySet()) {
            req.addHeader(header.getKey(), header.getValue());
        }
        try (Response response = http.newCall(req.build()).execute()) {
            ResponseBody responseBody = response.body();
            return responseBody == null ? "" : responseBody.string();
        }
    }

    @Override
    public String jsonPost(String uri, Map<String, String> data) throws IOException {
        String body = JSON.toJSONString(data);
        return post(uri, body, new HashMap<>());
    }
}
