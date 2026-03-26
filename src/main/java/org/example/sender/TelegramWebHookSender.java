package org.example.sender;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.nio.charset.StandardCharsets;

public class TelegramWebHookSender implements MessageSender {

    // TODO-1 텔레그램 bot token 을 등록한다.
    String botToken = "";

    // TODO-2 텔레그램 chat id 를 등록한다.
    String chatId = "";

    @Override
    public void sendMessage(Request request) {

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = "https://api.telegram.org/bot" + botToken + "/sendMessage";
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json; charset=UTF-8");

            // subject와 message를 결합하여 텔레그램 메시지 생성
            String messageText = "*" + request.getSubject() + "*\n" + request.getMessage();
            TelegramBody telegramBody = new TelegramBody(chatId, messageText);

            Gson gson = new Gson();
            StringEntity stringEntity = new StringEntity(gson.toJson(telegramBody), StandardCharsets.UTF_8);
            httpPost.setEntity(stringEntity);
            CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpPost);
            if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                System.out.println("something is wrong");
            }
        } catch (Exception e) {
            System.out.println("something is wrong. " + e);
        }

    }

    public static class TelegramBody {
        String chat_id;
        String text;
        String parse_mode;

        public TelegramBody(String chatId, String text) {
            this.chat_id = chatId;
            this.text = text;
            this.parse_mode = "Markdown"; // subject를 bold로 표시하기 위해 Markdown 모드 사용
        }
    }
}