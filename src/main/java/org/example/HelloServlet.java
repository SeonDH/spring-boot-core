package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;

// TODO-3: GET /hello 요청을 받았을 때, 응답할 Servlet 클래스를 구현한다.
//  - response 객체를 직접 모두 설정해서 반환해야한다.
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 응답 메시지 설정
        String responseMsg = "Hello World";

        // HTTP 응답 코드와 응답 길이 설정
        response.setContentType("text/plain");
        response.setContentLength(responseMsg.length());

        // 응답 보내기
        OutputStream os = response.getOutputStream();
        os.write(responseMsg.getBytes());
        os.flush();
        os.close();
    }
}