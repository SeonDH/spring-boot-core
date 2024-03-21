package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.farewell.Farewell;
import org.example.greeting.Greeting;
import org.example.sender.Request;
import org.example.sender.Sender;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final Greeting greeting;
    private final Sender sender;
    private final Farewell farewell;

    @Override
    public void run(ApplicationArguments args) {


        greeting.sayHello();

        Request request = new Request("sando", "hello");
        sender.sendMessage(request);

        farewell.sayGoodBye();

    }
}