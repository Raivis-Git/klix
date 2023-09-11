package com.klix.klix.integration.bank;

import com.google.gson.Gson;
import com.klix.klix.controller.dto.PostApplicationDTO;
import com.klix.klix.integration.bank.dto.Base.BaseBankRequest;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;

@Service
public abstract class BaseBank {

    public BaseBank() {
    }

    public BaseBank(PostApplicationDTO bankRequest) {
        convertRequest(bankRequest);
    }

    public static String requestGet(String url) {

        Gson gson = new Gson();
        HttpGet request = new HttpGet(url);
        request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            CloseableHttpResponse response = httpClient.execute(request);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (HttpURLConnection.HTTP_OK == statusCode)
                return EntityUtils.toString(response.getEntity());

            throw new Exception("Better luck next time");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends BaseBankRequest> String requestPost(String url, T bankRequest) throws UnsupportedEncodingException {

        Gson gson = new Gson();
        HttpPost request = new HttpPost(url);
        request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        request.setEntity(new StringEntity(gson.toJson(bankRequest)));

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            CloseableHttpResponse response = httpClient.execute(request);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (HttpURLConnection.HTTP_CREATED == statusCode)
                return EntityUtils.toString(response.getEntity());

            throw new Exception("Better luck next time");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    abstract void convertRequest(PostApplicationDTO bankRequest);

}
