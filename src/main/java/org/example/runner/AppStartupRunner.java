package org.example.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-3 빈으로 만든 DoorayWebHookSender 을 주입 받는다.


    @Override
    public void run(ApplicationArguments args) {

        //TODO-4 주입 받은 DoorayWebHookSender 를 이용해서 요청을 보낸다.

    }
}