package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppStartupRunner implements ApplicationRunner {


    //TODO-1 ServerProperties 값을 보기 위해서 빈처럼 가져와봤다.
    private final ServerProperties serverProperties;


    @Override
    public void run(ApplicationArguments args) {

        System.out.println(serverProperties.getPort());

    }
}