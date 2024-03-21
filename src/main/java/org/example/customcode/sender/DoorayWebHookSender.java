package org.example.customcode.sender;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.nio.charset.StandardCharsets;

//TODO-2 프레임워크 규칙을 참고해서 DoorayWebHookSender 를 사용하도록 한다.
public class DoorayWebHookSender implements Sender {

    //TODO-1 dooray web hook url 을 입력한다.
    String hookUrl = "";

    @Override
    public void sendMessage(Request request) {

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(hookUrl);
            httpPost.addHeader("Content-Type", "application/json; charset=UTF-8");
            HookBody hookBody = new HookBody(request.getName(), request.getMessage());
            Gson gson = new Gson();
            StringEntity stringEntity = new StringEntity(gson.toJson(hookBody), StandardCharsets.UTF_8);
            httpPost.setEntity(stringEntity);
            CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpPost);
            if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                System.out.println("something is wrong");
            }
        } catch (Exception e) {
            System.out.println("something is wrong. " + e);
        }

    }

    public static class HookBody {
        String botName;
        String botIconImage;
        String text;

        public HookBody(String botName, String text) {
            this.botName = botName;
            this.botIconImage = "https://static.dooray.com/static_images/dooray-bot.png";
            this.text = text;
        }
    }
}
