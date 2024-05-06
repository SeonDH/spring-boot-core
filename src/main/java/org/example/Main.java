package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO-1 포트 8080에서 HTTP 서버 생성
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        //TODO-2 "/hello" 경로에 대한 요청 처리
        server.createContext("/hello", new HelloHandler());

        //TODO-6 서버 시작
        server.start();
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            //TODO-3 응답 메시지 설정
            String response = "hello world";

            //TODO-4 HTTP 응답 코드와 응답 길이 설정
            exchange.sendResponseHeaders(200, response.getBytes().length);

            //TODO-5 응답 보내기
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}