package src.intellij.plugin;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class YiYan
{
    String apiUrl = "https://v1.hitokoto.cn/";

    public String getOnce()
    {
        var response = request(apiUrl);

        JSONObject   result = new JSONObject(response.body());
        StringBuffer buffer = new StringBuffer();
        buffer.append(result.getString("hitokoto"));
        buffer.append("<br/>");
        buffer.append(String.format(" —— %s「%s」", result.getString("creator"), result.getString("from")));

        return buffer.toString();
    }

    private static HttpResponse<String> request(String uri)
    {
        var request     = HttpRequest.newBuilder(URI.create(uri)).build();
        var client      = HttpClient.newHttpClient();
        var bodyHandler = HttpResponse.BodyHandlers.ofString();

        try {
            return client.send(request, bodyHandler);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
