package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.sender.MessageSender;
import org.example.sender.Request;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final MessageSender telegramWebHookSender;

    @Override
    public void run(ApplicationArguments args) {

        // TODO-5 원하는 메시지를 설정한다.
        telegramWebHookSender.sendMessage(new Request(null, null));

    }
}