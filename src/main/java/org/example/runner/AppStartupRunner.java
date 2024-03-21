package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.example.sender.MessageSender;
import org.example.sender.Request;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final MessageSender messageSender;

    @Override
    public void run(ApplicationArguments args) {
        Request request = new Request("sando", "hello");
        messageSender.sendMessage(request);
    }
}